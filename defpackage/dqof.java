package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqof extends dqxn {
    public final String a;

    public dqof(dqxe dqxeVar, String str) {
        super(dqxeVar);
        this.a = str;
    }

    @Override // defpackage.dqxe
    public final String ai(dqxp dqxpVar) {
        return "(" + this.b.ai(dqxpVar) + ") AS " + this.a;
    }

    @Override // defpackage.dqxe
    public final String aj(dqxp dqxpVar, List list) {
        return "(" + this.b.aj(dqxpVar, list) + ") AS " + this.a;
    }
}
