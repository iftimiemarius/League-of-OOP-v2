package heroes;

import abilities.BackstabAbility;
import abilities.DeflectAbility;
import abilities.DrainAbility;
import abilities.ExecuteAbility;
import abilities.FireblastAbility;
import abilities.IgniteAbility;
import abilities.ParalysisAbility;
import abilities.SlamAbility;
import utils.Constants;

public class Rogue extends Hero {
  private int consecutiveRounds = 0;

  @Override
  public final void fight(final Hero hero) {

  }

  @Override
  public final void visitRaceAmplifier(final ExecuteAbility executeAbility) {
    this.setAmplifier(Constants.EXECUTE_ROGUE_AMPLIFIER);
  }

  @Override
  public final void visitRaceAmplifier(final SlamAbility slamAbility) {
    this.setAmplifier(Constants.SLAM_ROGUE_AMPLIFIER);
  }

  @Override
  public final void visitRaceAmplifier(final FireblastAbility fireblastAbility) {
    this.setAmplifier(Constants.FIREBLAST_ROGUE_AMPLIFIER);
  }

  @Override
  public final void visitRaceAmplifier(final IgniteAbility igniteAbility) {
    this.setAmplifier(Constants.IGNITE_ROGUE_AMPLIFIER);
  }

  @Override
  public final void visitRaceAmplifier(final BackstabAbility backstabAbility) {
    this.setAmplifier(Constants.BACKSTAB_ROGUE_AMPLIFIER);
  }

  @Override
  public final void visitRaceAmplifier(final ParalysisAbility paralysisAbility) {
    this.setAmplifier(Constants.PARALYSIS_ROGUE_AMPLIFIER);
  }

  @Override
  public final void visitRaceAmplifier(final DrainAbility drainAbility) {
    this.setAmplifier(Constants.DRAIN_ROGUE_AMPLIFIER);
  }

  @Override
  public final void visitRaceAmplifier(final DeflectAbility deflectAbility) {
    this.setAmplifier(Constants.DEFLECT_ROGUE_AMPLIFIER);
  }
}

