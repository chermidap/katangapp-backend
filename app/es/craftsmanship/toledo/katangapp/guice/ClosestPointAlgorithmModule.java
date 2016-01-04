package es.craftsmanship.toledo.katangapp.guice;

import com.google.inject.AbstractModule;

import es.craftsmanship.toledo.katangapp.business.ClosestPointsAlgorithm;
import es.craftsmanship.toledo.katangapp.internal.algorithm.KatangappAlgorithm;

/**
 * @author mdelapenya
 */
public class ClosestPointAlgorithmModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ClosestPointsAlgorithm.class).to(KatangappAlgorithm.class);
	}

}