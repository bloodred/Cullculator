package calculator.view;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainViewController {

	double minDamage, maxDamage, minThrowDamage, maxThrowDamage, minBackstabDamage, maxBackstabDamage;


	double olPainlessDamage = 1.1;
	double masterCrafterDamage = 1.1;
	double longshotDamage = 1.6;
	double goldenArmDamage = 2;
	double knuckleDraggerDamage = 1.5;
	double brutusSneakyPokerDamage = 1.5;
	double expose1Damage = 1.1;
	double expose2Damage = 1.15;
	double expose3Damage = 1.2;
	double exposeTrapperDamage = 1.3;
	double muscleMilkDamage = 1.15;
	double headshotDamage = 2;

	double toughMotherDamage = .9;
	double armorDamage = .5;
	double thickSkinDamage = .7;
	double bombSuitDamage = .7;
	double iron4SkinDamage = .85;

	ObservableList<String> weaponSelectList =FXCollections.observableArrayList
			("Fists", "Rock", "Stick",
			 "Crafted Knife", "Crafted Spear", "Crafted Hatchet", "Crafted Cudgel",
			 "Brass Knuckles", "Tonfa", "Hammer",
			 "Crowbar", "Steel Pipe", "Cleaver", "Ice Axe", "Tanto Knife", "Machete", "Javelin",
			 "Pipe Wrench", "Baseball Bat", "Bowie Knife", "Kukri", "Tactical Machete", "Sabre", "Tomahawk", "Survival Spear",
			 "Sledgehammer", "Katana", "Fireman's Axe", "Trident",
			 "Crafted Bow", "Recurve Bow", "Compound Bow", "Auto Bow",
			 "Crafted Explosive", "Dynamite", "Impact Grenade", "Explosive Mine", "Remote Explosive",
			 "Revolver", "SMG", "Rifle");

	@FXML
	private Label versionNumber;
	@FXML
	private Label minDamageLabel;
	@FXML
	private Label maxDamageLabel;
	@FXML
	private Label minThrowDamageLabel;
	@FXML
	private Label maxThrowDamageLabel;
	@FXML
	private Label minBackstabDamageLabel;
	@FXML
	private Label maxBackstabDamageLabel;
	@FXML
	private Label damageDash;
	@FXML
	private Label backstabDash;
	@FXML
	private Label throwDash;
	@FXML
	private Label backstabDamageEquals;
	@FXML
	private Label throwDamageEquals;
	@FXML
	private CheckBox perkOlPainless;
	@FXML
	private CheckBox perkMasterCrafter;
	@FXML
	private CheckBox perkGoldenArm;
	@FXML
	private CheckBox perkLongshot;
	@FXML
	private CheckBox perkKnuckleDragger;
	@FXML
	private CheckBox perkBrutusSneakyPoker;
	@FXML
	private CheckBox perkToughMother;
	@FXML
	private CheckBox perkThickSkin;
	@FXML
	private CheckBox perkBombSuit;
	@FXML
	private CheckBox muscleMilk;
	@FXML
	private CheckBox headshot;
	@FXML
	private CheckBox armor;
	@FXML
	private CheckBox iron4Skin;
	@FXML
	private CheckBox expose1;
	@FXML
	private CheckBox expose2;
	@FXML
	private CheckBox expose3;
	@FXML
	private CheckBox exposeTrapper;
	@FXML
	public ComboBox<String> weaponSelectBox;

	@FXML
	private void initialize() {
		weaponSelectBox.setItems(weaponSelectList);
		damageDash.setVisible(false);
		backstabDash.setVisible(false);
		throwDash.setVisible(false);
		throwDamageEquals.setVisible(false);
		backstabDamageEquals.setVisible(false);
		versionNumber.setText("v1.3.1");
	}

	@FXML
	private void calculateOlPainless() {

		if (perkOlPainless.isSelected()) {
	        minDamage *= olPainlessDamage;
	        maxDamage *= olPainlessDamage;
	        minThrowDamage *= olPainlessDamage;
	        maxThrowDamage *= olPainlessDamage;
	        minBackstabDamage *= olPainlessDamage;
	        maxBackstabDamage *= olPainlessDamage;
	    } else if (!perkOlPainless.isSelected()) {
	    	minDamage /= olPainlessDamage;
	    	maxDamage /= olPainlessDamage;
	    	minThrowDamage /= olPainlessDamage;
	    	maxThrowDamage /= olPainlessDamage;
	        minBackstabDamage /= olPainlessDamage;
	        maxBackstabDamage /= olPainlessDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateKnuckleDragger() {

		if (perkKnuckleDragger.isSelected()) {
	        minDamage *= knuckleDraggerDamage;
	        maxDamage *= knuckleDraggerDamage;
	        minBackstabDamage *= knuckleDraggerDamage;
	        maxBackstabDamage *= knuckleDraggerDamage;
	    } else if (!perkKnuckleDragger.isSelected()) {
	    	minDamage /= knuckleDraggerDamage;
	    	maxDamage /= knuckleDraggerDamage;
	        minBackstabDamage /= knuckleDraggerDamage;
	        maxBackstabDamage /= knuckleDraggerDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateGoldenArm() {

		if (weaponSelectBox.getValue().equals("Crafted Knife")
			| weaponSelectBox.getValue().equals("Crafted Cudgel")
			| weaponSelectBox.getValue().equals("Crafted Hatchet")
			| weaponSelectBox.getValue().equals("Crafted Spear")) {
			goldenArmDamage = 1.5;
		} else {
			goldenArmDamage = 2;
		}

		if (perkGoldenArm.isSelected()) {
	        minThrowDamage *= goldenArmDamage;
	        maxThrowDamage *= goldenArmDamage;
	    } else if (!perkKnuckleDragger.isSelected()) {
	    	minThrowDamage /= goldenArmDamage;
	    	maxThrowDamage /= goldenArmDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateLongshot() {


		if (perkLongshot.isSelected()) {
	        minDamage *= longshotDamage;
	        maxDamage *= longshotDamage;
	    } else if (!perkLongshot.isSelected()) {
	    	minDamage /= longshotDamage;
	    	maxDamage /= longshotDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateMasterCrafter() {

		if (perkMasterCrafter.isSelected()) {
	        minDamage *= masterCrafterDamage;
	        maxDamage *= masterCrafterDamage;
	        minBackstabDamage *= masterCrafterDamage;
	        maxBackstabDamage *= masterCrafterDamage;
	    } else if (!perkMasterCrafter.isSelected()) {
	    	minDamage /= masterCrafterDamage;
	    	maxDamage /= masterCrafterDamage;
	        minBackstabDamage /= masterCrafterDamage;
	        maxBackstabDamage /= masterCrafterDamage;
	    }
		//Master Crafter does 5% extra damage to thrown crafted weapons, however Xaviant just told me it is on their to do list to fix so I wont be coding it in
		showDamage();
	}

	@FXML
	private void calculateBrutusSneakyPoker() {


		if (perkBrutusSneakyPoker.isSelected()) {

	        minBackstabDamage *= brutusSneakyPokerDamage;
	        maxBackstabDamage *= brutusSneakyPokerDamage;
	    } else if (!perkBrutusSneakyPoker.isSelected()) {
	    	minBackstabDamage /= brutusSneakyPokerDamage;
	        maxBackstabDamage /= brutusSneakyPokerDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateToughMother() {

		if (perkToughMother.isSelected()) {
	        minDamage *= toughMotherDamage;
	        maxDamage *= toughMotherDamage;
	        minBackstabDamage *= toughMotherDamage;
	        maxBackstabDamage *= toughMotherDamage;
	        minThrowDamage *= toughMotherDamage;
	        maxThrowDamage *= toughMotherDamage;
	    } else if (!perkToughMother.isSelected()) {
	    	minDamage /= toughMotherDamage;
	    	maxDamage /= toughMotherDamage;
	        minBackstabDamage /= toughMotherDamage;
	        maxBackstabDamage /= toughMotherDamage;
	    	minThrowDamage /= toughMotherDamage;
	    	maxThrowDamage /= toughMotherDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateThickSkin() {

		if (perkThickSkin.isSelected()) {
			if (weaponSelectBox.getValue().equals("Crafted Bow")
					| weaponSelectBox.getValue().equals("Recurve Bow")
					| weaponSelectBox.getValue().equals("Compound Bow")
					| weaponSelectBox.getValue().equals("Auto Bow")) {
				minDamage *= thickSkinDamage;
				maxDamage *= thickSkinDamage;
			} else {
		        minThrowDamage *= thickSkinDamage;
		        maxThrowDamage *= thickSkinDamage;
			}

	    } else if (!perkThickSkin.isSelected()) {
	    	if (weaponSelectBox.getValue().equals("Crafted Bow")
					| weaponSelectBox.getValue().equals("Recurve Bow")
					| weaponSelectBox.getValue().equals("Compound Bow")
					| weaponSelectBox.getValue().equals("Auto Bow")) {
				minDamage /= thickSkinDamage;
				maxDamage /= thickSkinDamage;
			} else {
		        minThrowDamage /= thickSkinDamage;
		        maxThrowDamage /= thickSkinDamage;
			}
	    }

		showDamage();
	}

	@FXML
	private void calculateBombSuit() {

		if (perkBombSuit.isSelected()) {
	        minDamage *= bombSuitDamage;
	        maxDamage *= bombSuitDamage;
	    } else if (!perkBombSuit.isSelected()) {
	    	minDamage /= bombSuitDamage;
	    	maxDamage /= bombSuitDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateArmor() {

		if (armor.isSelected()) {
	        minDamage *= armorDamage;
	        maxDamage *= armorDamage;
	        minBackstabDamage *= armorDamage;
	        maxBackstabDamage *= armorDamage;
	        minThrowDamage *= armorDamage;
	        maxThrowDamage *= armorDamage;
	    } else if (!armor.isSelected()) {
	    	minDamage /= armorDamage;
	    	maxDamage /= armorDamage;
	        minBackstabDamage /= armorDamage;
	        maxBackstabDamage /= armorDamage;
	    	minThrowDamage /= armorDamage;
	    	maxThrowDamage /= armorDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateMusclemilk() {

		if (muscleMilk.isSelected()) {
	        minDamage *= muscleMilkDamage;
	        maxDamage *= muscleMilkDamage;
	        minBackstabDamage *= muscleMilkDamage;
	        maxBackstabDamage *= muscleMilkDamage;
	        minThrowDamage *= muscleMilkDamage;
	        maxThrowDamage *= muscleMilkDamage;
	    } else if (!muscleMilk.isSelected()) {
	    	minDamage /= muscleMilkDamage;
	    	maxDamage /= muscleMilkDamage;
	        minBackstabDamage /= muscleMilkDamage;
	        maxBackstabDamage /= muscleMilkDamage;
	    	minThrowDamage /= muscleMilkDamage;
	    	maxThrowDamage /= muscleMilkDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateiron4Skin() {

		if (iron4Skin.isSelected()) {
	        minDamage *= iron4SkinDamage;
	        maxDamage *= iron4SkinDamage;
	        minBackstabDamage *= iron4SkinDamage;
	        maxBackstabDamage *= iron4SkinDamage;
	        minThrowDamage *= iron4SkinDamage;
	        maxThrowDamage *= iron4SkinDamage;
	    } else if (!iron4Skin.isSelected()) {
	    	minDamage /= iron4SkinDamage;
	    	maxDamage /= iron4SkinDamage;
	        minBackstabDamage /= iron4SkinDamage;
	        maxBackstabDamage /= iron4SkinDamage;
	    	minThrowDamage /= iron4SkinDamage;
	    	maxThrowDamage /= iron4SkinDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateHeadshot() {

		if (headshot.isSelected()) {
	        minDamage *= headshotDamage;
	        maxDamage *= headshotDamage;
	    } else if (!headshot.isSelected()) {
	    	minDamage /= headshotDamage;
	    	maxDamage /= headshotDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateExpose1() {

		if (expose1.isSelected()) {
	        minDamage *= expose1Damage;
	        maxDamage *= expose1Damage;
	        minBackstabDamage *= expose1Damage;
	        maxBackstabDamage *= expose1Damage;
	        minThrowDamage *= expose1Damage;
	        maxThrowDamage *= expose1Damage;
	        expose2.setDisable(true);
			expose3.setDisable(true);
			exposeTrapper.setDisable(true);
	    } else if (!expose1.isSelected()) {
	    	minDamage /= expose1Damage;
	    	maxDamage /= expose1Damage;
	        minBackstabDamage /= expose1Damage;
	        maxBackstabDamage /= expose1Damage;
	    	minThrowDamage /= expose1Damage;
	    	maxThrowDamage /= expose1Damage;
			expose2.setDisable(false);
			expose3.setDisable(false);
			exposeTrapper.setDisable(false);
	    }

		showDamage();
	}

	@FXML
	private void calculateExpose2() {

		if (expose2.isSelected()) {
	        minDamage *= expose2Damage;
	        maxDamage *= expose2Damage;
	        minBackstabDamage *= expose2Damage;
	        maxBackstabDamage *= expose2Damage;
	        minThrowDamage *= expose2Damage;
	        maxThrowDamage *= expose2Damage;
	        expose1.setDisable(true);
			expose3.setDisable(true);
			exposeTrapper.setDisable(true);
	    } else if (!expose2.isSelected()) {
	    	minDamage /= expose2Damage;
	    	maxDamage /= expose2Damage;
	        minBackstabDamage /= expose2Damage;
	        maxBackstabDamage /= expose2Damage;
	    	minThrowDamage /= expose2Damage;
	    	maxThrowDamage /= expose2Damage;
			expose1.setDisable(false);
			expose3.setDisable(false);
			exposeTrapper.setDisable(false);
	    }

		showDamage();
	}

	@FXML
	private void calculateExpose3() {

		if (expose3.isSelected()) {
	        minDamage *= expose3Damage;
	        maxDamage *= expose3Damage;
	        minBackstabDamage *= expose3Damage;
	        maxBackstabDamage *= expose3Damage;
	        minThrowDamage *= expose3Damage;
	        maxThrowDamage *= expose3Damage;
	        expose1.setDisable(true);
			expose2.setDisable(true);
			exposeTrapper.setDisable(true);
	    } else if (!expose3.isSelected()) {
	    	minDamage /= expose3Damage;
	    	maxDamage /= expose3Damage;
	        minBackstabDamage /= expose3Damage;
	        maxBackstabDamage /= expose3Damage;
	    	minThrowDamage /= expose3Damage;
	    	maxThrowDamage /= expose3Damage;
			expose1.setDisable(false);
			expose2.setDisable(false);
			exposeTrapper.setDisable(false);
	    }

		showDamage();
	}

	@FXML
	private void calculateExposeTrapper() {

		if (exposeTrapper.isSelected()) {
	        minDamage *= exposeTrapperDamage;
	        maxDamage *= exposeTrapperDamage;
	        minBackstabDamage *= exposeTrapperDamage;
	        maxBackstabDamage *= exposeTrapperDamage;
	        minThrowDamage *= exposeTrapperDamage;
	        maxThrowDamage *= exposeTrapperDamage;
	        expose1.setDisable(true);
			expose3.setDisable(true);
			expose2.setDisable(true);
	    } else if (!exposeTrapper.isSelected()) {
	    	minDamage /= exposeTrapperDamage;
	    	maxDamage /= exposeTrapperDamage;
	        minBackstabDamage /= exposeTrapperDamage;
	        maxBackstabDamage /= exposeTrapperDamage;
	    	minThrowDamage /= exposeTrapperDamage;
	    	maxThrowDamage /= exposeTrapperDamage;
			expose1.setDisable(false);
			expose3.setDisable(false);
			expose2.setDisable(false);
	    }

		showDamage();
	}


	private void showDamage() {

		String minDamageString = String.format("%.2f", minDamage);
		String maxDamageString = String.format("%.2f", maxDamage);
		String minThrowDamageString = String.format("%.2f", minThrowDamage);
		String maxThrowDamageString = String.format("%.2f", maxThrowDamage);
		String minBackstabDamageString = String.format("%.2f", minBackstabDamage);
		String maxBackstabDamageString = String.format("%.2f", maxBackstabDamage);

		if (weaponSelectBox.getValue().equals("Crafted Explosive")
				| weaponSelectBox.getValue().equals("Dynamite")
				| weaponSelectBox.getValue().equals("Impact Grenade")
				| weaponSelectBox.getValue().equals("Explosive Mine")
				| weaponSelectBox.getValue().equals("Remote Explosive")
				| weaponSelectBox.getValue().equals("Revolver")
				| weaponSelectBox.getValue().equals("SMG")
				| weaponSelectBox.getValue().equals("Rifle")
				| weaponSelectBox.getValue().equals("Auto Bow")) {

			minDamageLabel.setText(minDamageString);
			maxDamageLabel.setText("");
			minBackstabDamageLabel.setText("");
			maxBackstabDamageLabel.setText("");
			minThrowDamageLabel.setText("");
			maxThrowDamageLabel.setText("");

		} else if (weaponSelectBox.getValue().equals("Fists")
				| weaponSelectBox.getValue().equals("Crafted Bow")
				| weaponSelectBox.getValue().equals("Recurve Bow")
				| weaponSelectBox.getValue().equals("Compound Bow")) {

			minDamageLabel.setText(minDamageString);
			maxDamageLabel.setText(maxDamageString);
			damageDash.setVisible(true);
			minBackstabDamageLabel.setText("");
			maxBackstabDamageLabel.setText("");
			minThrowDamageLabel.setText("");
			maxThrowDamageLabel.setText("");

		} else {

			minDamageLabel.setText(minDamageString);
			maxDamageLabel.setText(maxDamageString);
			damageDash.setVisible(true);
			minBackstabDamageLabel.setText(minBackstabDamageString);
			maxBackstabDamageLabel.setText(maxBackstabDamageString);
			backstabDash.setVisible(true);
			backstabDamageEquals.setVisible(true);
			minThrowDamageLabel.setText(minThrowDamageString);
			maxThrowDamageLabel.setText(maxThrowDamageString);
			throwDash.setVisible(true);
			throwDamageEquals.setVisible(true);
		}
	}

	private void weaponDamage() {

		if (weaponSelectBox.getValue().equals("Rock")) {
			minDamage = 5;
			maxDamage = 15;
			minBackstabDamage = 5;
			maxBackstabDamage = 15;
			minThrowDamage = 4;
			maxThrowDamage = 8;

		} else if (weaponSelectBox.getValue().equals("Stick")) {
			minDamage = 5;
			maxDamage = 15;
			minBackstabDamage = 5;
			maxBackstabDamage = 15;
			minThrowDamage = 4;
			maxThrowDamage = 8;

		} else if (weaponSelectBox.getValue().equals("Fists")) {
			minDamage = 5;
			maxDamage = 15;
			minBackstabDamage = 5;
			maxBackstabDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Crafted Knife")) {
			minDamage = 6;
			maxDamage = 17;
			minBackstabDamage = 9;
			maxBackstabDamage = 25.5;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Crafted Spear")) {
			minDamage = 6;
			maxDamage = 18;
			minBackstabDamage = 9;
			maxBackstabDamage = 27;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Crafted Hatchet")) {
			minDamage = 6;
			maxDamage = 17;
			minBackstabDamage = 9;
			maxBackstabDamage = 25.5;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Crafted Cudgel")) {
			minDamage = 6;
			maxDamage = 18;
			minBackstabDamage = 9;
			maxBackstabDamage = 27;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Brass Knuckles")) {
			minDamage = 6;
			maxDamage = 18;
			minBackstabDamage = 9;
			maxBackstabDamage = 27;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Tonfa")) {
			minDamage = 6;
			maxDamage = 18;
			minBackstabDamage = 9;
			maxBackstabDamage = 27;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Hammer")) {
			minDamage = 6;
			maxDamage = 18;
			minBackstabDamage = 9;
			maxBackstabDamage = 27;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Crowbar")) {
			minDamage = 7;
			maxDamage = 21;
			minBackstabDamage = 10.5;
			maxBackstabDamage = 31.5;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Steel Pipe")) {
			minDamage = 8;
			maxDamage = 24;
			minBackstabDamage = 12;
			maxBackstabDamage = 36;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Cleaver")) {
			minDamage = 8;
			maxDamage = 22;
			minBackstabDamage = 12;
			maxBackstabDamage = 33;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Ice Axe")) {
			minDamage = 7;
			maxDamage = 23;
			minBackstabDamage = 10.5;
			maxBackstabDamage = 34.5;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Tanto Knife")) {
			minDamage = 6;
			maxDamage = 19;
			minBackstabDamage = 9;
			maxBackstabDamage = 28.5;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Machete")) {
			minDamage = 7;
			maxDamage = 22;
			minBackstabDamage = 10.5;
			maxBackstabDamage = 33;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Javelin")) {
			minDamage = 7;
			maxDamage = 22;
			minBackstabDamage = 10.5;
			maxBackstabDamage = 33;
			minThrowDamage = 6;
			maxThrowDamage = 21;

		} else if (weaponSelectBox.getValue().equals("Pipe Wrench")) {
			minDamage = 9;
			maxDamage = 27;
			minBackstabDamage = 13.5;
			maxBackstabDamage = 40.5;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Baseball Bat")) {
			minDamage = 8;
			maxDamage = 24;
			minBackstabDamage = 12;
			maxBackstabDamage = 36;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Bowie Knife")) {
			minDamage = 7;
			maxDamage = 23;
			minBackstabDamage = 10.5;
			maxBackstabDamage = 34.5;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Kukri")) {
			minDamage = 8;
			maxDamage = 24;
			minBackstabDamage = 12;
			maxBackstabDamage = 36;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Tactical Machete")) {
			minDamage = 8;
			maxDamage = 24;
			minBackstabDamage = 12;
			maxBackstabDamage = 36;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Sabre")) {
			minDamage = 7;
			maxDamage = 23;
			minBackstabDamage = 10.5;
			maxBackstabDamage = 34.5;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Tomahawk")) {
			minDamage = 7;
			maxDamage = 25;
			minBackstabDamage = 10.5;
			maxBackstabDamage = 37.5;
			minThrowDamage = 7;
			maxThrowDamage = 24;

		} else if (weaponSelectBox.getValue().equals("Survival Spear")) {
			minDamage = 9;
			maxDamage = 27;
			minBackstabDamage = 13.5;
			maxBackstabDamage = 40.5;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Sledgehammer")) {
			minDamage = 11;
			maxDamage = 33;
			minBackstabDamage = 16.5;
			maxBackstabDamage = 49.5;
			minThrowDamage = 7;
			maxThrowDamage = 21;

		} else if (weaponSelectBox.getValue().equals("Katana")) {
			minDamage = 9;
			maxDamage = 26;
			minBackstabDamage = 13.5;
			maxBackstabDamage = 39;
			minThrowDamage = 7;
			maxThrowDamage = 21;

		} else if (weaponSelectBox.getValue().equals("Fireman's Axe")) {
			minDamage = 9;
			maxDamage = 29;
			minBackstabDamage = 13.5;
			maxBackstabDamage = 43.5;
			minThrowDamage = 7;
			maxThrowDamage = 21;

		} else if (weaponSelectBox.getValue().equals("Trident")) {
			minDamage = 10;
			maxDamage = 30;
			minBackstabDamage = 15;
			maxBackstabDamage = 45;
			minThrowDamage = 7;
			maxThrowDamage = 21;

		} else if (weaponSelectBox.getValue().equals("Crafted Explosive")) {
			minDamage = 35;

		} else if (weaponSelectBox.getValue().equals("Dynamite")) {
			minDamage = 75;

		} else if (weaponSelectBox.getValue().equals("Impact Grenade")) {
			minDamage = 50;

		} else if (weaponSelectBox.getValue().equals("Explosive Mine")) {
			minDamage = 65;

		} else if (weaponSelectBox.getValue().equals("Remote Explosive")) {
			minDamage = 75;

		} else if (weaponSelectBox.getValue().equals("Revolver")) {
			minDamage = 28;

		} else if (weaponSelectBox.getValue().equals("SMG")) {
			minDamage = 13;

		} else if (weaponSelectBox.getValue().equals("Rifle")) {
			minDamage = 48;

		} else if (weaponSelectBox.getValue().equals("Crafted Bow")) {
			minDamage = 4;
			maxDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Recurve Bow")) {
			minDamage = 5;
			maxDamage = 16;

		} else if (weaponSelectBox.getValue().equals("Compound Bow")) {
			minDamage = 7;
			maxDamage = 20;

		} else if (weaponSelectBox.getValue().equals("Auto Bow")) {
			minDamage = 6;

		}
	}

	private void unselectAll() {

		perkMasterCrafter.setDisable(true);
		perkMasterCrafter.setSelected(false);

		perkGoldenArm.setDisable(true);
		perkGoldenArm.setSelected(false);

		perkBrutusSneakyPoker.setDisable(true);
		perkBrutusSneakyPoker.setSelected(false);

		perkKnuckleDragger.setDisable(true);
		perkKnuckleDragger.setSelected(false);

		perkLongshot.setDisable(true);
		perkLongshot.setSelected(false);

		perkThickSkin.setDisable(true);
		perkThickSkin.setSelected(false);

		perkBombSuit.setDisable(true);
		perkBombSuit.setSelected(false);

		muscleMilk.setDisable(true);
		muscleMilk.setSelected(false);

		headshot.setDisable(true);
		headshot.setSelected(false);

		perkOlPainless.setSelected(false);
		perkToughMother.setSelected(false);
		armor.setSelected(false);
		iron4Skin.setSelected(false);

		expose1.setSelected(false);
		expose1.setDisable(false);
		expose2.setSelected(false);
		expose2.setDisable(false);
		expose3.setSelected(false);
		expose3.setDisable(false);
		exposeTrapper.setSelected(false);
		exposeTrapper.setDisable(false);

		damageDash.setVisible(false);
		throwDash.setVisible(false);
		backstabDash.setVisible(false);
		backstabDamageEquals.setVisible(false);
		throwDamageEquals.setVisible(false);

	}

	private void allowMasterCrafter() {

		if (weaponSelectBox.getValue().equals("Crafted Knife")
				| weaponSelectBox.getValue().equals("Crafted Cudgel")
				| weaponSelectBox.getValue().equals("Crafted Hatchet")
				| weaponSelectBox.getValue().equals("Crafted Spear")
				| weaponSelectBox.getValue().equals("Crafted Bow")
				| weaponSelectBox.getValue().equals("Crafted Explosive")) {

			perkMasterCrafter.setDisable(false);
		}
	}

	private void allowBrutusSneakyPoker() {

		if (weaponSelectBox.getValue().equals("Crafted Knife")
				| weaponSelectBox.getValue().equals("Tanto Knife")
				| weaponSelectBox.getValue().equals("Machete")
				| weaponSelectBox.getValue().equals("Bowie Knife")
				| weaponSelectBox.getValue().equals("Kukri")
				| weaponSelectBox.getValue().equals("Tactical Machete")
				| weaponSelectBox.getValue().equals("Sabre")
				| weaponSelectBox.getValue().equals("Katana")
				| weaponSelectBox.getValue().equals("Crafted Spear")
				| weaponSelectBox.getValue().equals("Javelin")
				| weaponSelectBox.getValue().equals("Survival Spear")
				| weaponSelectBox.getValue().equals("Trident")) {

			perkBrutusSneakyPoker.setDisable(false);
		}
	}

	private void allowGoldenArm() {

		if (weaponSelectBox.getValue().equals("Rock")
				| weaponSelectBox.getValue().equals("Stick")
				| weaponSelectBox.getValue().equals("Crafted Knife")
				| weaponSelectBox.getValue().equals("Crafted Cudgel")
				| weaponSelectBox.getValue().equals("Crafted Hatchet")
				| weaponSelectBox.getValue().equals("Crafted Spear")
				| weaponSelectBox.getValue().equals("Brass Knuckles")
				| weaponSelectBox.getValue().equals("Tonfa")
				| weaponSelectBox.getValue().equals("Hammer")
				| weaponSelectBox.getValue().equals("Crowbar")
				| weaponSelectBox.getValue().equals("Steel Pipe")
				| weaponSelectBox.getValue().equals("Cleaver")
				| weaponSelectBox.getValue().equals("Ice Axe")
				| weaponSelectBox.getValue().equals("Tanto Knife")
				| weaponSelectBox.getValue().equals("Machete")
				| weaponSelectBox.getValue().equals("Javelin")
				| weaponSelectBox.getValue().equals("Pipe Wrench")
				| weaponSelectBox.getValue().equals("Baseball Bat")
				| weaponSelectBox.getValue().equals("Bowie Knife")
				| weaponSelectBox.getValue().equals("Kukri")
				| weaponSelectBox.getValue().equals("Tactical Machete")
				| weaponSelectBox.getValue().equals("Sabre")
				| weaponSelectBox.getValue().equals("Tomahawk")
				| weaponSelectBox.getValue().equals("Survival Spear")
				| weaponSelectBox.getValue().equals("Sledgehammer")
				| weaponSelectBox.getValue().equals("Katana")
				| weaponSelectBox.getValue().equals("Fireman's Axe")
				| weaponSelectBox.getValue().equals("Trident")) {

			perkGoldenArm.setDisable(false);
		}
	}

	private void allowKnuckleDragger() {

		if (weaponSelectBox.getValue().equals("Brass Knuckles")) {

			perkKnuckleDragger.setDisable(false);
		}
	}

	private void allowLongshot() {

		if (weaponSelectBox.getValue().equals("Crafted Bow")
				| weaponSelectBox.getValue().equals("Recurve Bow")
				| weaponSelectBox.getValue().equals("Compound Bow")
				| weaponSelectBox.getValue().equals("Auto Bow")) {

			perkLongshot.setDisable(false);
		}
	}

	private void allowThickSkin() {

		if (weaponSelectBox.getValue().equals("Rock")
				| weaponSelectBox.getValue().equals("Stick")
				| weaponSelectBox.getValue().equals("Crafted Knife")
				| weaponSelectBox.getValue().equals("Crafted Cudgel")
				| weaponSelectBox.getValue().equals("Crafted Hatchet")
				| weaponSelectBox.getValue().equals("Crafted Spear")
				| weaponSelectBox.getValue().equals("Brass Knuckles")
				| weaponSelectBox.getValue().equals("Tonfa")
				| weaponSelectBox.getValue().equals("Hammer")
				| weaponSelectBox.getValue().equals("Crowbar")
				| weaponSelectBox.getValue().equals("Steel Pipe")
				| weaponSelectBox.getValue().equals("Cleaver")
				| weaponSelectBox.getValue().equals("Ice Axe")
				| weaponSelectBox.getValue().equals("Tanto Knife")
				| weaponSelectBox.getValue().equals("Machete")
				| weaponSelectBox.getValue().equals("Javelin")
				| weaponSelectBox.getValue().equals("Pipe Wrench")
				| weaponSelectBox.getValue().equals("Baseball Bat")
				| weaponSelectBox.getValue().equals("Bowie Knife")
				| weaponSelectBox.getValue().equals("Kukri")
				| weaponSelectBox.getValue().equals("Tactical Machete")
				| weaponSelectBox.getValue().equals("Sabre")
				| weaponSelectBox.getValue().equals("Tomahawk")
				| weaponSelectBox.getValue().equals("Survival Spear")
				| weaponSelectBox.getValue().equals("Sledgehammer")
				| weaponSelectBox.getValue().equals("Katana")
				| weaponSelectBox.getValue().equals("Fireman's Axe")
				| weaponSelectBox.getValue().equals("Trident")
				| weaponSelectBox.getValue().equals("Crafted Bow")
				| weaponSelectBox.getValue().equals("Recurve Bow")
				| weaponSelectBox.getValue().equals("Compound Bow")
				| weaponSelectBox.getValue().equals("Auto Bow")) {

			perkThickSkin.setDisable(false);
		}
	}

	private void allowBombSuit() {

		if (weaponSelectBox.getValue().equals("Crafted Explosive")
				| weaponSelectBox.getValue().equals("Dynamite")
				| weaponSelectBox.getValue().equals("Impact Grenade")
				| weaponSelectBox.getValue().equals("Explosive Mine")
				| weaponSelectBox.getValue().equals("Remote Explosive")
				| weaponSelectBox.getValue().equals("Revolver")
				| weaponSelectBox.getValue().equals("SMG")
				| weaponSelectBox.getValue().equals("Rifle")) {

			perkBombSuit.setDisable(false);
		}
	}

	private void allowHeadshot() {

		if (weaponSelectBox.getValue().equals("Crafted Bow")
				| weaponSelectBox.getValue().equals("Recurve Bow")
				| weaponSelectBox.getValue().equals("Compound Bow")
				| weaponSelectBox.getValue().equals("Auto Bow")
				| weaponSelectBox.getValue().equals("Revolver")
				| weaponSelectBox.getValue().equals("SMG")
				| weaponSelectBox.getValue().equals("Rifle")) {

			headshot.setDisable(false);
		}
	}

	private void allowMuscleMilk() {

		if (weaponSelectBox.getValue().equals("Rock")
				| weaponSelectBox.getValue().equals("Stick")
				| weaponSelectBox.getValue().equals("Fists")
				| weaponSelectBox.getValue().equals("Crafted Knife")
				| weaponSelectBox.getValue().equals("Crafted Cudgel")
				| weaponSelectBox.getValue().equals("Crafted Hatchet")
				| weaponSelectBox.getValue().equals("Crafted Spear")
				| weaponSelectBox.getValue().equals("Brass Knuckles")
				| weaponSelectBox.getValue().equals("Tonfa")
				| weaponSelectBox.getValue().equals("Hammer")
				| weaponSelectBox.getValue().equals("Crowbar")
				| weaponSelectBox.getValue().equals("Steel Pipe")
				| weaponSelectBox.getValue().equals("Cleaver")
				| weaponSelectBox.getValue().equals("Ice Axe")
				| weaponSelectBox.getValue().equals("Tanto Knife")
				| weaponSelectBox.getValue().equals("Machete")
				| weaponSelectBox.getValue().equals("Javelin")
				| weaponSelectBox.getValue().equals("Pipe Wrench")
				| weaponSelectBox.getValue().equals("Baseball Bat")
				| weaponSelectBox.getValue().equals("Bowie Knife")
				| weaponSelectBox.getValue().equals("Kukri")
				| weaponSelectBox.getValue().equals("Tactical Machete")
				| weaponSelectBox.getValue().equals("Sabre")
				| weaponSelectBox.getValue().equals("Tomahawk")
				| weaponSelectBox.getValue().equals("Survival Spear")
				| weaponSelectBox.getValue().equals("Sledgehammer")
				| weaponSelectBox.getValue().equals("Katana")
				| weaponSelectBox.getValue().equals("Fireman's Axe")
				| weaponSelectBox.getValue().equals("Trident")) {

			muscleMilk.setDisable(false);
		}
	}

	@FXML
	private void weaponChoice() {

		unselectAll();

		allowGoldenArm();
		allowMasterCrafter();
		allowBrutusSneakyPoker();
		allowKnuckleDragger();
		allowLongshot();
		allowThickSkin();
		allowBombSuit();
		allowHeadshot();
		allowMuscleMilk();

		weaponDamage();
		showDamage();
	}

}
