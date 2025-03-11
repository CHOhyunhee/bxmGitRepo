package bxm.dft.smp.online.bean.postProcess;

import bxm.BizPostprocessor;
import bxm.common.Context;
import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;
import bxm.dft.common.util.DefaultGuidGenerator;
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.online.dbio.DSmpEmpTst000;
import bxm.dft.smp.online.dbio.dto.DBxmLogTestIO3;
import bxm.omm.root.IOmmObject;
import bxm.request.ContextHeader;
import bxm.transaction.Propagation;
import bxm.transaction.annotation.TransactionalOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 *
 * @author sysadmin
 */
@BxmBean("SimplePostProcessor")
@BxmCategory(logicalName = "", description = "", author = "sysadmin")
public class SimplePostProcessor extends BizPostprocessor {
	private Logger logger = LoggerFactory.getLogger(getClass());

	private DSmpEmpTst000 dSmpEmpInfMng;

	@Override
	public void postProcess(Context ctx, ContextHeader header, IOmmObject input, IOmmObject output) throws Exception {

		logger.debug("SimplePostProcessor header is {}", header);
		logger.debug("SimplePostProcessor input is {}", input);
		logger.debug("SimplePostProcessor output is {}", output);
		logger.debug("SimplePostProcessor context is {}", ctx);

		// TODO Auto-generated method stub
		this.initBeans();

		DBxmLogTestIO3 dbioInput = new DBxmLogTestIO3();
		dbioInput.setDomainId("DEFAULT");
		dbioInput.setTrxGuid(DefaultGuidGenerator.generateInitialGuid());
		dbioInput.setLogData("SimplePostProcessor The BXM_LOG_TEST table is added one recored");

		resultLogSave(dbioInput);
		logger.debug(" SimplePostProcessor The BXM_LOG_TEST is SAVED");

	}

	public void onException(Context traceContext, ContextHeader header, IOmmObject requestData, IOmmObject responseData,
			Throwable ex) {
		try {
			this.initBeans();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.debug(" SimplePostProcessor onException");
		logger.debug("SimplePostProcessor onException header is {}", header);
		logger.debug("SimplePostProcessor onException IOmmObject is {}", requestData);
		logger.debug("SimplePostProcessor onException responseData is {}", responseData);
		logger.debug("SimplePostProcessor onException error is {}", ex);

		DBxmLogTestIO3 dbioInputEx = new DBxmLogTestIO3();
		dbioInputEx.setDomainId("DEFAULT");
		dbioInputEx.setTrxGuid(DefaultGuidGenerator.generateInitialGuid());
		dbioInputEx.setLogData("onException is started");
		resultLogSave(dbioInputEx);

		logger.debug(" SimplePostProcessor  onException The BXM_LOG_TEST is SAVED");

	}

	@TransactionalOperation(propagation = Propagation.REQUIRES_NEW)
	public int resultLogSave(DBxmLogTestIO3 input) {
		logger.debug(" resultLogSave is started7");


			dSmpEmpInfMng.insertAppLog(input);		
	

		return 0;
	}

	private void initBeans() throws Exception {
		logger.debug(" SimplePostProcessor getBean");
		if (dSmpEmpInfMng == null) {
			dSmpEmpInfMng = DefaultApplicationContext.getBean(dSmpEmpInfMng, DSmpEmpTst000.class);
		}
	}
}
