package bxm.dft.smp.batch.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Scope;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.batch.dbio.DSmpEmpTmp001;

/**
 * 
 *
 * @author sysadmin
 */
@Scope("step")
@BxmBean("BxmTestTaskletBean")
@BxmCategory(logicalName="BxmTest Tasklet Bean", author="sysadmin")
public class BxmTestTaskletBean implements Tasklet
{
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private DSmpEmpTmp001 dSmpEmpTmp100;
	/**
	 * 
	 * 
	 * @param stepContribution 현재 단계 실행을 업데이트하기 위해 되돌릴 수 있는 변경 가능한 상태
	 * @param chunkContext 호출 간에는 공유되지만 재시작 간에는 공유되지 않는 특성
	 * @return 처리가 계속 가능한지 여부를 나타내는 RepeatStatus
	 */
	@Override
	@BxmCategory(logicalName="BxmTest Tasklet Bean", description="", author="sysadmin")
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception
	{
		
	if(dSmpEmpTmp100==null) {
		dSmpEmpTmp100 = DefaultApplicationContext.getBean(DSmpEmpTmp001.class);
	}
	
	dSmpEmpTmp100.insert01();
	
		
		return RepeatStatus.FINISHED;
	}
}
