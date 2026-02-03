package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvjs {
    private static dvjs c;
    public int a;
    public int b;

    private dvjs(Context context) throws IOException {
        dvia.b();
        try {
            Properties properties = new Properties();
            properties.load(context.getAssets().open("lighter-properties.txt"));
            this.a = 2;
            String property = properties.getProperty("BUILD_BASELINE_CHANGELIST");
            this.b = TextUtils.isEmpty(property) ? 0 : Integer.parseInt(property);
        } catch (IOException e) {
            throw new RuntimeException("Lighter properties was not found in the apk", e);
        }
    }

    public static synchronized dvjs a(Context context) {
        dvjs dvjsVar = c;
        if (dvjsVar != null) {
            return dvjsVar;
        }
        dvjs dvjsVar2 = new dvjs(context);
        c = dvjsVar2;
        return dvjsVar2;
    }
}
