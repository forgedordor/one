package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoow extends eoou {
    @Override // defpackage.eoou
    public final int a(eoox eooxVar) {
        int i;
        synchronized (eooxVar) {
            i = eooxVar.remainingField - 1;
            eooxVar.remainingField = i;
        }
        return i;
    }

    @Override // defpackage.eoou
    public final void b(eoox eooxVar, Set set) {
        synchronized (eooxVar) {
            if (eooxVar.seenExceptionsField == null) {
                eooxVar.seenExceptionsField = set;
            }
        }
    }
}
