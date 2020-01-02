package angels;

import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;
import magician.Magician;
import utils.Constants;
import utils.Position;

public final class DarkAngel extends Angel {
  public DarkAngel(Position position, Magician magician) {
    super(position, magician);
  }

  @Override
  public void visitDamageAmplifier(final Knight knight) {
    if (knight.getCurrentHp() > 0) {
      knight.setCurrentHp(knight.getCurrentHp() - 40);
      this.getMagician().update(this, Constants.DARK_ANGEL_HIT + knight.heroTypeAndIndex());
    }
  }

  @Override
  public void visitDamageAmplifier(final Pyromancer pyromancer) {
    if (pyromancer.getCurrentHp() > 0) {
      pyromancer.setCurrentHp(pyromancer.getCurrentHp() - 30);
      this.getMagician().update(this, Constants.DARK_ANGEL_HIT + pyromancer.heroTypeAndIndex());
    }
  }

  @Override
  public void visitDamageAmplifier(final Rogue rogue) {
    if (rogue.getCurrentHp() > 0) {
      rogue.setCurrentHp(rogue.getCurrentHp() - 10);
      this.getMagician().update(this, Constants.DARK_ANGEL_HIT + rogue.heroTypeAndIndex());
    }
  }

  @Override
  public void visitDamageAmplifier(final Wizard wizard) {
    if (wizard.getCurrentHp() > 0) {
      wizard.setCurrentHp(wizard.getCurrentHp() - 20);
      this.getMagician().update(this, Constants.DARK_ANGEL_HIT + wizard.heroTypeAndIndex());
    }
  }

  @Override
  public void spawn() {
    int row = this.getPosition().getCurrentRow();
    int column = this.getPosition().getCurrentColumn();
    this.getMagician().update(this, Constants.DARK_ANGEL_SPAWNED + row + " " + column);
  }
}
