package calculator.view;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainViewController {

	double minDamage, maxDamage, minThrowDamage, maxThrowDamage;


	double olPainlessDamage = 1.1;
	double masterCrafterDamage = 1.1;
	double longshotDamage = 1.6;
	double goldenArmDamage = 2;
	double knuckleDraggerDamage = 1.5;
	double brutusSneakyPokerDamage = 2;
	double expose1Damage = 1.1;
	double expose2Damage = 1.15;
	double expose3Damage = 1.2;
	double exposeTrapperDamage = 1.3;
	double backstabDamage = 1.5;
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
	private Label minDamageLabel;
	@FXML
	private Label maxDamageLabel;
	@FXML
	private Label minThrowDamageLabel;
	@FXML
	private Label maxThrowDamageLabel;
	@FXML
	private Label damageDash;
	@FXML
	private Label throwDash;
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
	private CheckBox backstab;
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
		throwDash.setVisible(false);
		throwDamageEquals.setVisible(false);
	}

	@FXML
	private void calculateOlPainless() {

		if (perkOlPainless.isSelected()) {
	        minDamage = minDamage * olPainlessDamage;
	        maxDamage = maxDamage * olPainlessDamage;
	        minThrowDamage = minThrowDamage * olPainlessDamage;
	        maxThrowDamage = maxThrowDamage * olPainlessDamage;
	    } else if (!perkOlPainless.isSelected()) {
	    	minDamage = minDamage / olPainlessDamage;
	    	maxDamage = maxDamage / olPainlessDamage;
	    	minThrowDamage = minThrowDamage / olPainlessDamage;
	    	maxThrowDamage = maxThrowDamage / olPainlessDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateKnuckleDragger() {

		if (perkKnuckleDragger.isSelected()) {
	        minDamage = minDamage * knuckleDraggerDamage;
	        maxDamage = maxDamage * knuckleDraggerDamage;
	    } else if (!perkKnuckleDragger.isSelected()) {
	    	minDamage = minDamage / knuckleDraggerDamage;
	    	maxDamage = maxDamage / knuckleDraggerDamage;
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
	        minThrowDamage = minThrowDamage * goldenArmDamage;
	        maxThrowDamage = maxThrowDamage * goldenArmDamage;
	    } else if (!perkKnuckleDragger.isSelected()) {
	    	minThrowDamage = minThrowDamage / goldenArmDamage;
	    	maxThrowDamage = maxThrowDamage / goldenArmDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateLongshot() {


		if (perkLongshot.isSelected()) {
	        minDamage = minDamage * longshotDamage;
	        maxDamage = maxDamage * longshotDamage;
	    } else if (!perkLongshot.isSelected()) {
	    	minDamage = minDamage / longshotDamage;
	    	maxDamage = maxDamage / longshotDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateMasterCrafter() {

		if (perkMasterCrafter.isSelected()) {
	        minDamage = minDamage * masterCrafterDamage;
	        maxDamage = maxDamage * masterCrafterDamage;
	    } else if (!perkMasterCrafter.isSelected()) {
	    	minDamage = minDamage / masterCrafterDamage;
	    	maxDamage = maxDamage / masterCrafterDamage;
	    }
		//Master Crafter does 5% extra damage to thrown crafted weapons, however Xaviant just told me it is on their to do list to fix so I wont be coding it in
		showDamage();
	}

	@FXML
	private void calculateBrutusSneakyPoker() {


		if (perkBrutusSneakyPoker.isSelected()) {

			if (backstab.isSelected()) {
		    	minDamage = minDamage / backstabDamage;
		    	maxDamage = maxDamage / backstabDamage;
				backstab.setSelected(false);
				backstab.setDisable(true);
			}

	        minDamage = minDamage * brutusSneakyPokerDamage;
	        maxDamage = maxDamage * brutusSneakyPokerDamage;
	        backstab.setSelected(false);
			backstab.setDisable(true);
	    } else if (!perkBrutusSneakyPoker.isSelected()) {
	    	minDamage = minDamage / brutusSneakyPokerDamage;
	    	maxDamage = maxDamage / brutusSneakyPokerDamage;
			backstab.setDisable(false);
	    }

		showDamage();
	}

	@FXML
	private void calculateBackstab() {

		if (backstab.isSelected()) {
	        minDamage = minDamage * backstabDamage;
	        maxDamage = maxDamage * backstabDamage;
	    } else if (!backstab.isSelected()) {
	    	minDamage = minDamage / backstabDamage;
	    	maxDamage = maxDamage / backstabDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateToughMother() {

		if (perkToughMother.isSelected()) {
	        minDamage = minDamage * toughMotherDamage;
	        maxDamage = maxDamage * toughMotherDamage;
	        minThrowDamage = minThrowDamage * toughMotherDamage;
	        maxThrowDamage = maxThrowDamage * toughMotherDamage;
	    } else if (!perkToughMother.isSelected()) {
	    	minDamage = minDamage / toughMotherDamage;
	    	maxDamage = maxDamage / toughMotherDamage;
	    	minThrowDamage = minThrowDamage / toughMotherDamage;
	    	maxThrowDamage = maxThrowDamage / toughMotherDamage;
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
				minDamage = minDamage * thickSkinDamage;
				maxDamage = maxDamage * thickSkinDamage;
			} else {
		        minThrowDamage = minThrowDamage * thickSkinDamage;
		        maxThrowDamage = maxThrowDamage * thickSkinDamage;
			}

	    } else if (!perkThickSkin.isSelected()) {
	    	if (weaponSelectBox.getValue().equals("Crafted Bow")
					| weaponSelectBox.getValue().equals("Recurve Bow")
					| weaponSelectBox.getValue().equals("Compound Bow")
					| weaponSelectBox.getValue().equals("Auto Bow")) {
				minDamage = minDamage / thickSkinDamage;
				maxDamage = maxDamage / thickSkinDamage;
			} else {
		        minThrowDamage = minThrowDamage / thickSkinDamage;
		        maxThrowDamage = maxThrowDamage / thickSkinDamage;
			}
	    }

		showDamage();
	}

	@FXML
	private void calculateBombSuit() {

		if (perkBombSuit.isSelected()) {
	        minDamage = minDamage * bombSuitDamage;
	        maxDamage = maxDamage * bombSuitDamage;
	    } else if (!perkBombSuit.isSelected()) {
	    	minDamage = minDamage / bombSuitDamage;
	    	maxDamage = maxDamage / bombSuitDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateArmor() {

		if (armor.isSelected()) {
	        minDamage = minDamage * armorDamage;
	        maxDamage = maxDamage * armorDamage;
	        minThrowDamage = minThrowDamage * armorDamage;
	        maxThrowDamage = maxThrowDamage * armorDamage;
	    } else if (!armor.isSelected()) {
	    	minDamage = minDamage / armorDamage;
	    	maxDamage = maxDamage / armorDamage;
	    	minThrowDamage = minThrowDamage / armorDamage;
	    	maxThrowDamage = maxThrowDamage / armorDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateMusclemilk() {

		if (muscleMilk.isSelected()) {
	        minDamage = minDamage * muscleMilkDamage;
	        maxDamage = maxDamage * muscleMilkDamage;
	    } else if (!muscleMilk.isSelected()) {
	    	minDamage = minDamage / muscleMilkDamage;
	    	maxDamage = maxDamage / muscleMilkDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateiron4Skin() {

		if (iron4Skin.isSelected()) {
	        minDamage = minDamage * iron4SkinDamage;
	        maxDamage = maxDamage * iron4SkinDamage;
	        minThrowDamage = minThrowDamage * iron4SkinDamage;
	        maxThrowDamage = maxThrowDamage * iron4SkinDamage;
	    } else if (!iron4Skin.isSelected()) {
	    	minDamage = minDamage / iron4SkinDamage;
	    	maxDamage = maxDamage / iron4SkinDamage;
	    	minThrowDamage = minThrowDamage / iron4SkinDamage;
	    	maxThrowDamage = maxThrowDamage / iron4SkinDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateHeadshot() {

		if (headshot.isSelected()) {
	        minDamage = minDamage * headshotDamage;
	        maxDamage = maxDamage * headshotDamage;
	    } else if (!headshot.isSelected()) {
	    	minDamage = minDamage / headshotDamage;
	    	maxDamage = maxDamage / headshotDamage;
	    }

		showDamage();
	}

	@FXML
	private void calculateExpose1() {

		if (expose1.isSelected()) {
	        minDamage = minDamage * expose1Damage;
	        maxDamage = maxDamage * expose1Damage;
	        minThrowDamage = minThrowDamage * expose1Damage;
	        maxThrowDamage = maxThrowDamage * expose1Damage;
	        expose2.setDisable(true);
			expose3.setDisable(true);
			exposeTrapper.setDisable(true);
	    } else if (!expose1.isSelected()) {
	    	minDamage = minDamage / expose1Damage;
	    	maxDamage = maxDamage / expose1Damage;
	    	minThrowDamage = minThrowDamage / expose1Damage;
	    	maxThrowDamage = maxThrowDamage / expose1Damage;
			expose2.setDisable(false);
			expose3.setDisable(false);
			exposeTrapper.setDisable(false);
	    }

		showDamage();
	}

	@FXML
	private void calculateExpose2() {

		if (expose2.isSelected()) {
	        minDamage = minDamage * expose2Damage;
	        maxDamage = maxDamage * expose2Damage;
	        minThrowDamage = minThrowDamage * expose2Damage;
	        maxThrowDamage = maxThrowDamage * expose2Damage;
	        expose1.setDisable(true);
			expose3.setDisable(true);
			exposeTrapper.setDisable(true);
	    } else if (!expose2.isSelected()) {
	    	minDamage = minDamage / expose2Damage;
	    	maxDamage = maxDamage / expose2Damage;
	    	minThrowDamage = minThrowDamage / expose2Damage;
	    	maxThrowDamage = maxThrowDamage / expose2Damage;
			expose1.setDisable(false);
			expose3.setDisable(false);
			exposeTrapper.setDisable(false);
	    }

		showDamage();
	}

	@FXML
	private void calculateExpose3() {

		if (expose3.isSelected()) {
	        minDamage = minDamage * expose3Damage;
	        maxDamage = maxDamage * expose3Damage;
	        minThrowDamage = minThrowDamage * expose3Damage;
	        maxThrowDamage = maxThrowDamage * expose3Damage;
	        expose1.setDisable(true);
			expose2.setDisable(true);
			exposeTrapper.setDisable(true);
	    } else if (!expose3.isSelected()) {
	    	minDamage = minDamage / expose3Damage;
	    	maxDamage = maxDamage / expose3Damage;
	    	minThrowDamage = minThrowDamage / expose3Damage;
	    	maxThrowDamage = maxThrowDamage / expose3Damage;
			expose1.setDisable(false);
			expose2.setDisable(false);
			exposeTrapper.setDisable(false);
	    }

		showDamage();
	}

	@FXML
	private void calculateExposeTrapper() {

		if (exposeTrapper.isSelected()) {
	        minDamage = minDamage * exposeTrapperDamage;
	        maxDamage = maxDamage * exposeTrapperDamage;
	        minThrowDamage = minThrowDamage * exposeTrapperDamage;
	        maxThrowDamage = maxThrowDamage * exposeTrapperDamage;
	        expose1.setDisable(true);
			expose3.setDisable(true);
			expose2.setDisable(true);
	    } else if (!exposeTrapper.isSelected()) {
	    	minDamage = minDamage / exposeTrapperDamage;
	    	maxDamage = maxDamage / exposeTrapperDamage;
	    	minThrowDamage = minThrowDamage / exposeTrapperDamage;
	    	maxThrowDamage = maxThrowDamage / exposeTrapperDamage;
			expose1.setDisable(false);
			expose3.setDisable(false);
			expose2.setDisable(false);
	    }

		showDamage();
	}


	private void showDamage() {

		String minDamageString, maxDamageString, minThrowDamageString, maxThrowDamageString;

		minDamageString = String.format("%.2f", minDamage);
		maxDamageString = String.format("%.2f", maxDamage);
		minThrowDamageString = String.format("%.2f", minThrowDamage);
		maxThrowDamageString = String.format("%.2f", maxThrowDamage);

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
			minThrowDamageLabel.setText("");
			maxThrowDamageLabel.setText("");

		} else if (weaponSelectBox.getValue().equals("Fists")
				| weaponSelectBox.getValue().equals("Crafted Bow")
				| weaponSelectBox.getValue().equals("Recurve Bow")
				| weaponSelectBox.getValue().equals("Compound Bow")) {

			minDamageLabel.setText(minDamageString);
			maxDamageLabel.setText(maxDamageString);
			damageDash.setVisible(true);
			minThrowDamageLabel.setText("");
			maxThrowDamageLabel.setText("");

		} else {

			minDamageLabel.setText(minDamageString);
			maxDamageLabel.setText(maxDamageString);
			damageDash.setVisible(true);
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
			minThrowDamage = 4;
			maxThrowDamage = 8;

		} else if (weaponSelectBox.getValue().equals("Stick")) {
			minDamage = 5;
			maxDamage = 15;
			minThrowDamage = 4;
			maxThrowDamage = 8;

		} else if (weaponSelectBox.getValue().equals("Fists")) {
			minDamage = 5;
			maxDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Crafted Knife")) {
			minDamage = 6;
			maxDamage = 17;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Crafted Spear")) {
			minDamage = 6;
			maxDamage = 18;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Crafted Hatchet")) {
			minDamage = 6;
			maxDamage = 16;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Crafted Cudgel")) {
			minDamage = 6;
			maxDamage = 18;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Brass Knuckles")) {
			minDamage = 6;
			maxDamage = 18;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Tonfa")) {
			minDamage = 6;
			maxDamage = 18;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Hammer")) {
			minDamage = 6;
			maxDamage = 18;
			minThrowDamage = 4;
			maxThrowDamage = 12;

		} else if (weaponSelectBox.getValue().equals("Crowbar")) {
			minDamage = 7;
			maxDamage = 21;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Steel Pipe")) {
			minDamage = 8;
			maxDamage = 24;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Cleaver")) {
			minDamage = 7;
			maxDamage = 19;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Ice Axe")) {
			minDamage = 7;
			maxDamage = 20;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Tanto Knife")) {
			minDamage = 6;
			maxDamage = 19;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Machete")) {
			minDamage = 7;
			maxDamage = 22;
			minThrowDamage = 5;
			maxThrowDamage = 15;

		} else if (weaponSelectBox.getValue().equals("Javelin")) {
			minDamage = 7;
			maxDamage = 22;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Pipe Wrench")) {
			minDamage = 9;
			maxDamage = 27;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Baseball Bat")) {
			minDamage = 8;
			maxDamage = 24;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Bowie Knife")) {
			minDamage = 7;
			maxDamage = 23;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Kukri")) {
			minDamage = 8;
			maxDamage = 24;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Tactical Machete")) {
			minDamage = 8;
			maxDamage = 24;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Sabre")) {
			minDamage = 7;
			maxDamage = 23;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Tomahawk")) {
			minDamage = 7;
			maxDamage = 21;
			minThrowDamage = 7;
			maxThrowDamage = 21;

		} else if (weaponSelectBox.getValue().equals("Survival Spear")) {
			minDamage = 9;
			maxDamage = 27;
			minThrowDamage = 6;
			maxThrowDamage = 18;

		} else if (weaponSelectBox.getValue().equals("Sledgehammer")) {
			minDamage = 11;
			maxDamage = 33;
			minThrowDamage = 7;
			maxThrowDamage = 21;

		} else if (weaponSelectBox.getValue().equals("Katana")) {
			minDamage = 9;
			maxDamage = 26;
			minThrowDamage = 7;
			maxThrowDamage = 21;

		} else if (weaponSelectBox.getValue().equals("Fireman's Axe")) {
			minDamage = 9;
			maxDamage = 25;
			minThrowDamage = 7;
			maxThrowDamage = 21;

		} else if (weaponSelectBox.getValue().equals("Trident")) {
			minDamage = 10;
			maxDamage = 30;
			minThrowDamage = 7;
			maxThrowDamage = 21;

		} else if (weaponSelectBox.getValue().equals("Crafted Explosive")) {
			minDamage = 35;

		} else if (weaponSelectBox.getValue().equals("Dynamite")) {
			minDamage = 80;

		} else if (weaponSelectBox.getValue().equals("Impact Grenade")) {
			minDamage = 50;

		} else if (weaponSelectBox.getValue().equals("Explosive Mine")) {
			minDamage = 65;

		} else if (weaponSelectBox.getValue().equals("Remote Explosive")) {
			minDamage = 95;

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

		backstab.setDisable(true);
		backstab.setSelected(false);

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

	private void allowBackstab() {

		if (weaponSelectBox.getValue().equals("Crafted Knife")
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

			backstab.setDisable(false);
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
		allowBackstab();

		weaponDamage();
		showDamage();
	}

}
