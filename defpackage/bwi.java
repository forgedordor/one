package defpackage;

import android.util.Range;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bwi {
    public static final Range a;
    public static final Range b;

    static {
        Integer numValueOf = Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
        a = new Range(0, numValueOf);
        b = new Range(0, numValueOf);
        bwh bwhVarD = d();
        bwhVarD.b(0);
        bwhVarD.a();
    }

    public static bwh d() {
        bwk bwkVar = new bwk();
        bwkVar.b = -1;
        bwkVar.c = -1;
        bwkVar.b(-1);
        Range range = a;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        bwkVar.a = range;
        Range range2 = b;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        bwkVar.d = range2;
        return bwkVar;
    }

    public abstract int a();

    public abstract Range b();

    public abstract Range c();

    public abstract void e();

    public abstract void f();
}
