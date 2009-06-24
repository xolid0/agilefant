package fi.hut.soberit.agilefant.business;

import org.joda.time.LocalDate;

import fi.hut.soberit.agilefant.model.ExactEstimate;
import fi.hut.soberit.agilefant.model.Iteration;
import fi.hut.soberit.agilefant.model.IterationHistoryEntry;
import fi.hut.soberit.agilefant.transfer.IterationDataContainer;
import fi.hut.soberit.agilefant.transfer.IterationMetrics;

public interface IterationBusiness extends GenericBusiness<Iteration> {

    public IterationDataContainer getIterationContents(int iterationId);
    
    public IterationMetrics getIterationMetrics(Iteration iteration);

    ExactEstimate calculateDailyVelocity(LocalDate startDate, IterationHistoryEntry yesterdayEntry);
    
}
