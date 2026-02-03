package defpackage;

import android.graphics.Shader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipz {
    public static final iiy a(kyk kykVar) {
        if (!kykVar.d()) {
            return null;
        }
        Shader shader = kykVar.a;
        return shader != null ? new iiz(shader) : new ikt(ijg.c(kykVar.b));
    }

    public static final void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2) {
            if (next == 1) {
                throw new XmlPullParserException("No start tag found");
            }
            next = xmlPullParser.next();
        }
    }
}
