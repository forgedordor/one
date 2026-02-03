package defpackage;

import android.graphics.Picture;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ryk {
    public static final /* synthetic */ int e = 0;
    public rxk a = null;
    public final float b = 96.0f;
    public final rvz c = new rvz();
    final Map d = new HashMap();

    static {
        new DecimalFormat("#.0000");
        new cub(10);
    }

    protected ryk() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final rxq d(rxo rxoVar, String str) {
        rxq rxqVarD;
        rxq rxqVar = (rxq) rxoVar;
        if (str.equals(rxqVar.o)) {
            return rxqVar;
        }
        for (Object obj : rxoVar.n()) {
            if (obj instanceof rxq) {
                rxq rxqVar2 = (rxq) obj;
                if (str.equals(rxqVar2.o)) {
                    return rxqVar2;
                }
                if ((obj instanceof rxo) && (rxqVarD = d((rxo) obj, str)) != null) {
                    return rxqVarD;
                }
            }
        }
        return null;
    }

    protected final rxs a(String str) {
        String strSubstring;
        if (str == null || str.length() <= 1 || !str.startsWith("#") || (strSubstring = str.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.a.o)) {
            return this.a;
        }
        Map map = this.d;
        if (map.containsKey(strSubstring)) {
            return (rxs) map.get(strSubstring);
        }
        rxq rxqVarD = d(this.a, strSubstring);
        map.put(strSubstring, rxqVarD);
        return rxqVarD;
    }

    public final Picture b(int i, int i2) {
        Picture picture = new Picture();
        ryv ryvVar = new ryv(picture.beginRecording(i, i2), new rwh(0.0f, 0.0f, i, i2));
        ryvVar.c = this;
        rxk rxkVar = this.a;
        if (rxkVar == null) {
            ryv.h("Nothing to render. Document is empty.", new Object[0]);
        } else {
            ryvVar.d = new ryr();
            ryvVar.e = new Stack();
            ryvVar.g(ryvVar.d, rxj.a());
            ryr ryrVar = ryvVar.d;
            ryrVar.f = ryvVar.b;
            ryrVar.h = false;
            ryrVar.i = false;
            ryvVar.e.push(ryrVar.clone());
            new Stack();
            new Stack();
            ryvVar.g = new Stack();
            ryvVar.f = new Stack();
            ryvVar.d(rxkVar);
            ryvVar.f(rxkVar, rxkVar.c, rxkVar.d, rxkVar.w, rxkVar.v);
        }
        picture.endRecording();
        return picture;
    }

    public final rwh c() {
        int i;
        float fG;
        int i2;
        rxk rxkVar = this.a;
        rwu rwuVar = rxkVar.c;
        rwu rwuVar2 = rxkVar.d;
        if (rwuVar != null && !rwuVar.f() && (i = rwuVar.b) != 9 && i != 2 && i != 3) {
            float fG2 = rwuVar.g();
            if (rwuVar2 == null) {
                rwh rwhVar = rxkVar.w;
                fG = rwhVar != null ? (rwhVar.d * fG2) / rwhVar.c : fG2;
            } else if (!rwuVar2.f() && (i2 = rwuVar2.b) != 9 && i2 != 2 && i2 != 3) {
                fG = rwuVar2.g();
            }
            return new rwh(0.0f, 0.0f, fG2, fG);
        }
        return new rwh(-1.0f, -1.0f, -1.0f, -1.0f);
    }
}
