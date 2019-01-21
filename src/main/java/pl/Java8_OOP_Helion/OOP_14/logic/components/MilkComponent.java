package pl.Java8_OOP_Helion.OOP_14.logic.components;

import pl.Java8_OOP_Helion.OOP_14.logic.view.UserInterface;
import pl.Java8_OOP_Helion.OOP_14.model.Storage;
import pl.Java8_OOP_Helion.OOP_14.model.exceptions.EmptyBoxException;

public class MilkComponent extends Component {




    public MilkComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getCoffe();
        userInterface.showStep("Mleko");
    }
}
