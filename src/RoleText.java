public class RoleText {

    private String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder anwser = new StringBuilder("");
        String[] rolesFormated = new String[roles.length];
        boolean firstEnter;

        for (int i = 0; i < roles.length; i++) {
            rolesFormated[i] = roles[i] + ":";
        }
        for (int j = 0; j < rolesFormated.length; j++) {
            String roleCurrent = roles[j];
            anwser.append(rolesFormated[j]);
            for (int i = 0; i < textLines.length; i++) {
                String role, speech;
                role = textLines[i].substring(0, textLines[i].indexOf(':'));
                speech = textLines[i].substring(textLines[i].indexOf(':')+1,textLines[i].length());
                if (roleCurrent.equals(role)) {
                    anwser.append('\n');
                    anwser.append(Integer.toString(i+1) + ")" + speech);
                }
            }
            anwser.append('\n');
            anwser.append('\n');
        }
        return anwser.toString();
    }
}
