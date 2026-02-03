package defpackage;

import android.util.Range;
import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cax {
    public static final Range e = new Range(0, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
    public static final bxs f;

    static {
        List<bxo> listAsList = Arrays.asList(bxo.d, bxo.c, bxo.b);
        bxo bxoVar = bxo.d;
        int i = bxc.d;
        bwn bwnVar = new bwn(bxoVar, 1);
        lcg.j(listAsList, "qualities cannot be null");
        lcg.b(!listAsList.isEmpty(), "qualities cannot be empty");
        for (bxo bxoVar2 : listAsList) {
            boolean zE = bxo.e(bxoVar2);
            Objects.toString(bxoVar2);
            lcg.b(zE, "qualities contain invalid quality: ".concat(String.valueOf(bxoVar2)));
        }
        f = new bxs(listAsList, bwnVar);
    }

    public static caw e() {
        bwy bwyVar = new bwy();
        bwyVar.c(f);
        bwyVar.a = 0;
        Range range = e;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        bwyVar.b = range;
        bwyVar.b(-1);
        return bwyVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract Range c();

    public abstract bxs d();
}
