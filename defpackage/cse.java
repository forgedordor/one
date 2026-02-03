package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cse {
    private cse() {
    }

    public static int a() throws IOException, NumberFormatException {
        ClassLoader classLoader = cse.class.getClassLoader();
        classLoader.getClass();
        InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
        if (resourceAsStream == null) {
            throw new IllegalStateException(String.format("Car API level file %s not found", "car-app-api.level"));
        }
        try {
            String line = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
            int i = Integer.parseInt(line);
            if (i <= 0 || i > 8) {
                throw new IllegalStateException(a.v(line, "Unrecognized Car API level: "));
            }
            return i;
        } catch (IOException unused) {
            throw new IllegalStateException("Unable to read Car API level file");
        }
    }
}
