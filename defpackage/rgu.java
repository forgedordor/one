package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgu {
    public final rrh a;
    public final lcd b;
    private final Class c;
    private final List d;
    private final String e;

    public rgu(Class cls, Class cls2, Class cls3, List list, rrh rrhVar, lcd lcdVar) {
        this.c = cls;
        this.d = list;
        this.a = rrhVar;
        this.b = lcdVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final rhy a(rfi rfiVar, int i, int i2, rex rexVar, List list) throws rhs {
        List list2 = this.d;
        int size = list2.size();
        rhy rhyVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            rez rezVar = (rez) list2.get(i3);
            try {
                if (rezVar.b(rfiVar.a(), rexVar)) {
                    rhyVarA = rezVar.a(rfiVar.a(), i, i2, rexVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for ".concat(String.valueOf(String.valueOf(rezVar))), e);
                }
                list.add(e);
            }
            if (rhyVarA != null) {
                break;
            }
        }
        if (rhyVarA != null) {
            return rhyVarA;
        }
        throw new rhs(this.e, new ArrayList(list));
    }

    public final String toString() {
        rrh rrhVar = this.a;
        List list = this.d;
        return "DecodePath{ dataClass=" + String.valueOf(this.c) + ", decoders=" + String.valueOf(list) + ", transcoder=" + rrhVar.toString() + "}";
    }
}
