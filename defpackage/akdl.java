package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akdl implements akcy {
    final /* synthetic */ cidt a;
    final /* synthetic */ efoi b;

    public akdl(cidt cidtVar, efoi efoiVar) {
        this.a = cidtVar;
        this.b = efoiVar;
    }

    @Override // defpackage.akcy
    public final Instant a() {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(this.b.b);
        instantOfEpochMilli.getClass();
        return instantOfEpochMilli;
    }

    @Override // defpackage.akcy
    public final Integer b() {
        cidt cidtVar = this.a;
        if ((cidtVar.b & 1) != 0) {
            return Integer.valueOf(cidtVar.c);
        }
        return null;
    }
}
