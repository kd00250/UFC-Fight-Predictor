package edu.westga.cs1302.javafx_sample.view;

import edu.westga.cs1302.javafx_sample.viewModel.mainWindowViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Codebehind for the Main Window of the application.
 * 
 * @author Kenneth Dearman
 * @version Fall 2024
 */
public class MainWindow {

	@FXML
	private TextField ageFighter1;

	@FXML
	private TextField ageFighter2;

	@FXML
	private TextField heightFighter1;

	@FXML
	private TextField heightFighter2;

	@FXML
	private TextField nameFighter1;

	@FXML
	private TextField nameFighter2;

	@FXML
	private Button projectWinnerButton;

	@FXML
	private TextField reachFighter1;

	@FXML
	private TextField reachFighter2;

	@FXML
	private Label fighter1AgeErrorLabel;

	@FXML
	private Label fighter1HeightErrorLabel;

	@FXML
	private Label fighter1NameErrorLabel;

	@FXML
	private Label fighter1ReachErrorLabel;

	@FXML
	private Label fighter2AgeErrorLabel;

	@FXML
	private Label fighter2HeightErrorLabel;

	@FXML
	private Label fighter2NameErrorLabel;

	@FXML
	private Label fighter2ReachErrorLabel;

	@FXML
	private ComboBox<String> styleFighter1ComboBox;

	@FXML
	private ComboBox<String> styleFighter2ComboBox;

	@FXML
	private ComboBox<String> weightClassComboBox;

	private mainWindowViewModel vm;

	private void projectWinner() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("CONGRATS");
		alert.setContentText(this.vm.compareFighters());
		alert.showAndWait();
	}

	/// right one
	private void nameFighter1Validation() {
		this.nameFighter1.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.isBlank()) {
				this.fighter1NameErrorLabel.setText("Name cannot be blank");
				return;
			}
			if (newValue.matches(".*\\d.*")) {
				this.fighter1NameErrorLabel.setText("Name cannot include numbers");
			} else {
				this.fighter1NameErrorLabel.setText("");
			}
		});
	}

	private void nameFighter2Validation() {
		this.nameFighter2.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.isBlank()) {
				this.fighter2NameErrorLabel.setText("Name cannot be blank");
				return;
			}
			if (newValue.matches(".*\\d.*")) {
				this.fighter2NameErrorLabel.setText("Name cannot include numbers");
			} else {
				this.fighter2NameErrorLabel.setText("");
			}
		});
	}

	private void ageFighter1Validation() {
		this.ageFighter1.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.isBlank()) {
				this.fighter1AgeErrorLabel.setText("Age cannont be blank");
				return;
			}
			if (newValue.matches("^-\\d+")) {
				this.fighter1AgeErrorLabel.setText("Age cannot be negative");
				return;
			}
			if (!newValue.matches("\\d{1,2}")) {
				this.fighter1AgeErrorLabel.setText("Age is invalid");
			} else {
				this.fighter1AgeErrorLabel.setText("");
			}
		});
	}

	private void ageFighter2Validation() {
		this.ageFighter2.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.isBlank()) {
				this.fighter2AgeErrorLabel.setText("Age cannont be blank");
				return;
			}
			if (newValue.matches("^-\\d+")) {
				this.fighter2AgeErrorLabel.setText("Age cannot be negative");
				return;
			}
			if (!newValue.matches("\\d{1,2}")) {
				this.fighter2AgeErrorLabel.setText("Age is invalid");
			} else {
				this.fighter2AgeErrorLabel.setText("");
			}
		});
	}

	private void heightFighter1Validation() {
		this.heightFighter1.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.isBlank()) {
				this.fighter1HeightErrorLabel.setText("Height cannot be blank");
				return;
			}
			if (!newValue.matches("^\\d{1},(0[0-9]|1[01])$")) {
				this.fighter1HeightErrorLabel.setText("Height format must be #,##");
			} else {
				this.fighter1HeightErrorLabel.setText("");
			}
		});
	}

	private void heightFighter2Validation() {
		this.heightFighter2.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.isBlank()) {
				this.fighter2HeightErrorLabel.setText("Height cannot be blank");
				return;
			}
			if (!newValue.matches("^\\d{1},(0[0-9]|1[01])$")) {
				this.fighter2HeightErrorLabel.setText("Height format must be #,##");
			} else {
				this.fighter2HeightErrorLabel.setText("");
			}
		});
	}

	private void reachFighter1Validation() {
		this.reachFighter1.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.isBlank()) {
				this.fighter1ReachErrorLabel.setText("Height cannot be blank");
				return;
			}
			if (!newValue.matches("^\\d{2}.[0-9]$")) {
				this.fighter1ReachErrorLabel.setText("Reach format must be ##.#");
			} else {
				this.fighter1ReachErrorLabel.setText("");
			}
		});
	}

	private void reachFighter2Validation() {
		this.reachFighter2.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.isBlank()) {
				this.fighter2ReachErrorLabel.setText("Height cannot be blank");
				return;
			}
			if (!newValue.matches("^\\d{2}.[0-9]$")) {
				this.fighter2ReachErrorLabel.setText("Reach format must be ##.#");
			} else {
				this.fighter2ReachErrorLabel.setText("");
			}
		});
	}

	private void setUpEnableControls() {
		this.projectWinnerButton.disableProperty().bind(this.nameFighter1.textProperty().isEmpty());
		this.projectWinnerButton.disableProperty().bind(this.nameFighter2.textProperty().isEmpty());
		this.projectWinnerButton.disableProperty().bind(this.ageFighter1.textProperty().isEmpty());
		this.projectWinnerButton.disableProperty().bind(this.ageFighter2.textProperty().isEmpty());
		this.projectWinnerButton.disableProperty().bind(this.heightFighter1.textProperty().isEmpty());
		this.projectWinnerButton.disableProperty().bind(this.heightFighter2.textProperty().isEmpty());
		this.projectWinnerButton.disableProperty().bind(this.reachFighter1.textProperty().isEmpty());
		this.projectWinnerButton.disableProperty().bind(this.reachFighter2.textProperty().isEmpty());
	}

	private void setBindings() {
		this.vm = new mainWindowViewModel();
		this.vm.getNameFighter1().bind(this.nameFighter1.textProperty());
		this.vm.getAgeFighter1().bind(this.ageFighter1.textProperty());
		this.vm.getHeightFighter1().bind(this.heightFighter1.textProperty());
		this.vm.getReachFighter1().bind(this.reachFighter1.textProperty());

		this.vm.getNameFighter2().bind(this.nameFighter2.textProperty());
		this.vm.getAgeFighter2().bind(this.ageFighter2.textProperty());
		this.vm.getHeightFighter2().bind(this.heightFighter2.textProperty());
		this.vm.getReachFighter2().bind(this.reachFighter2.textProperty());

		this.weightClassComboBox.setItems(this.vm.getWeightClass());
		this.styleFighter1ComboBox.setItems(this.vm.getStyleOfFighters());
		this.styleFighter2ComboBox.setItems(this.vm.getStyleOfFighters());

		this.weightClassComboBox.setValue(this.vm.getWeightClass().get(0));
		this.styleFighter1ComboBox.setValue(this.vm.getStyleOfFighters().get(0));
		this.styleFighter2ComboBox.setValue(this.vm.getStyleOfFighters().get(0));

		this.vm.getSelectedStyleFighter1().bind(this.styleFighter1ComboBox.getSelectionModel().selectedItemProperty());
		this.vm.getSelectedStyleFighter2().bind(this.styleFighter2ComboBox.getSelectionModel().selectedItemProperty());
		this.vm.getSelectedWeightClass().bind(this.weightClassComboBox.getSelectionModel().selectedItemProperty());
	}

	@FXML
	void initialize() {
		this.setBindings();

		this.nameFighter1Validation();
		this.nameFighter2Validation();
		this.ageFighter1Validation();
		this.ageFighter2Validation();
		this.heightFighter1Validation();
		this.heightFighter2Validation();
		this.reachFighter1Validation();
		this.reachFighter2Validation();

		this.setUpEnableControls();

		this.projectWinnerButton.setOnAction((event) -> {
			try {
				this.projectWinner();
			} catch (Exception error) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setContentText(error.getMessage());
				alert.showAndWait();
			}
		});
	}

}
