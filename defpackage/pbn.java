package defpackage;

import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbn extends pcv {
    final vo a;
    private final pby b;
    private final lbz c;

    public pbn(pcw pcwVar, pby pbyVar, vo voVar, lbz lbzVar) {
        pcwVar.a(this);
        lcg.a(true);
        lcg.a(voVar != null);
        lcg.a(true);
        this.b = pbyVar;
        this.a = voVar;
        this.c = lbzVar;
    }

    @Override // defpackage.pcv
    public final void a(Object obj, boolean z) {
        int iA = this.b.a(obj);
        if (iA >= 0) {
            this.c.accept(new pbm(this, iA));
        } else {
            Objects.toString(obj);
            Log.w("EventsRelays", "Item change notification received for unknown item: ".concat(String.valueOf(obj)));
        }
    }
}
