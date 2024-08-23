package com.example.makeTrust;

import com.example.makeTrust.enity.Game;
import com.example.makeTrust.enity.GameAccount;
import com.example.makeTrust.enity.LinkInfo;
import com.example.makeTrust.enity.myGame.AovAc;
import com.example.makeTrust.enity.myGame.LmhtAc;
import com.example.makeTrust.enity.myRole.Admin;
import com.example.makeTrust.enity.myRole.Shopper;
import com.example.makeTrust.enity.myRole.Supplier;
import com.example.makeTrust.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@AllArgsConstructor
public class MakeTrustApplication implements CommandLineRunner {

	UserRepository userRepository;
	GameAccountRepository gameAccountRepository;
	GameRepository gameRepository;
	LinkInfoRepository linkInfoRepository;

	public static void main(String[] args) {
		SpringApplication.run(MakeTrustApplication.class, args);
	}

	@Override
	public void run(String... args) {
//		Admin admin = new Admin();
//		admin.setPassword("p1");
//		admin.setUsername("a1");
//
//		Supplier supplier = new Supplier();
//		supplier.setUsername("s1");
//		supplier.setPassword("s1");
//		supplier.setBalance(8.2);
//
//		Shopper shopper = new Shopper();
//		shopper.setUsername("sp1");
//		shopper.setPassword("sp1");
//		shopper.setBalance(9.2);
//
//		userRepository.save(supplier);
//		userRepository.save(admin);
//		userRepository.save(shopper);
//		LinkInfo linkGmail = new LinkInfo();
//		linkGmail.setLinkInfoDes("Link Gmail");
//		linkGmail.setLinkInfoName("Gmail");
//
//		LinkInfo linkPhone = new LinkInfo();
//		linkPhone.setLinkInfoDes("Link Phone");
//		linkPhone.setLinkInfoName("Phone");
//
//		Set<LinkInfo> linkLmht = new HashSet<>();
//		linkLmht.add(linkPhone);
//
//		Set<LinkInfo> linkAov = new HashSet<>();
//		linkAov.add(linkPhone);
//		linkAov.add(linkGmail);
//
//		linkInfoRepository.save(linkPhone);
//		linkInfoRepository.save(linkGmail);
//
//
//		Game aovGame = new Game();
//		aovGame.setGameName("Area of valor");
//
//		Game lmhtGame = new Game();
//		lmhtGame.setGameName("League of legends");
//
//		gameRepository.save(aovGame);
//		gameRepository.save(lmhtGame);
//
//		AovAc aovAc = new AovAc();
//		aovAc.setGame(aovGame);
//		aovAc.setHero(15);
//		aovAc.setSkin(20);
//		aovAc.setPrice(9.2);
//		aovAc.setLinkInfos(linkAov);
//
//		LmhtAc lmhtAc = new LmhtAc();
//		lmhtAc.setGame(lmhtGame);
//		lmhtAc.setTFT("Master");
//		lmhtAc.setPrice(7.2);
//		lmhtAc.setLinkInfos(linkLmht);
//
//		GameAccount gameAccount = new GameAccount();
//		gameAccount.setGame(aovGame);
//		gameAccount.setPrice(10.0);
//
//
//		gameAccountRepository.save(gameAccount);
//		gameAccountRepository.save(lmhtAc);
//		gameAccountRepository.save(aovAc);
//
//



	}
}
