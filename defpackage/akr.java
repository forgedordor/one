package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akr extends akt implements Iterator {
    final /* synthetic */ aku a;
    private akq b;
    private boolean c = true;

    public akr(aku akuVar) {
        this.a = akuVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        akq akqVar;
        if (this.c) {
            this.c = false;
            akqVar = this.a.b;
        } else {
            akq akqVar2 = this.b;
            akqVar = akqVar2 != null ? akqVar2.c : null;
        }
        this.b = akqVar;
        return this.b;
    }

    @Override // defpackage.akt
    public final void dI(akq akqVar) {
        akq akqVar2 = this.b;
        if (akqVar == akqVar2) {
            akq akqVar3 = akqVar2.d;
            this.b = akqVar3;
            this.c = akqVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        akq akqVar = this.b;
        return (akqVar == null || akqVar.c == null) ? false : true;
    }
}
