package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alxn {
    final /* synthetic */ alxr a;
    private final ekgb b;
    private final ekgb c;

    public alxn(alxr alxrVar, ekgb ekgbVar, ekgb ekgbVar2) {
        this.a = alxrVar;
        this.b = ekgbVar;
        this.c = ekgbVar2;
    }

    private final void a(StringBuilder sb, ekgb ekgbVar, int i) {
        sb.append('\n');
        sb.append(this.a.a.getString(i));
        int size = ekgbVar.size();
        if (size != 0) {
            if (size != 1) {
                sb.append(fcva.aF(ekgbVar, "\n  ", "\n  ", null, null, 60));
            } else {
                sb.append(fcva.X(ekgbVar));
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb, this.b, R.string.received_label);
        a(sb, this.c, R.string.read_by_label);
        return sb.toString();
    }
}
