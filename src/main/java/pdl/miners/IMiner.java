package pdl.miners;

import pdl.web.models.Miner;
import pdl.web.models.MinerConfiguration;

public interface IMiner {

	public Miner getMinerWebModel();

	public void mine(MinerConfiguration configuration);

}
