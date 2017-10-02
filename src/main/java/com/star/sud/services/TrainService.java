package com.star.sud.services;

import java.util.List;

import com.star.sud.beans.Train;

/**
 * Created with IntelliJ IDEA. User: xvitcoder Date: 12/21/12 Time: 12:20 AM
 */
public interface TrainService {
	public List<Train> getAllTrains();

	public Train getTrainById(Long id);

	public void addTrain(Train train);

	public void deleteTrainById(Long id);

	public void deleteAll();

	public void updateTrain(Train train);
}
