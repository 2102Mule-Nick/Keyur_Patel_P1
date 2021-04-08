package com.revature.dao;

import java.util.List;

import com.revature.pojo.SMSTournament;

public interface SMSTournamentDao {

	public SMSTournament addSMSTournament(SMSTournament smsTournament);

	public void deleteSMSTournament(SMSTournament smsTournament);

	public SMSTournament updateSMSTournament(SMSTournament smsTournament);

	public List<SMSTournament> getAllSMSTournament();

	public SMSTournament getSMSTournamentById(int tournamentId);

	public SMSTournament getSMSTournamentByName(String tournamentName);

}
