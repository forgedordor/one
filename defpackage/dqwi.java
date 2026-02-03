package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqwi extends dqxn {
    public dqwi(dqxe dqxeVar) {
        super(dqxeVar);
    }

    @Override // defpackage.dqxe
    public final String ai(dqxp dqxpVar) {
        return "(SELECT NOT EXISTS " + this.b.ai(dqxpVar) + ")";
    }

    @Override // defpackage.dqxe
    public final String aj(dqxp dqxpVar, List list) {
        return "(SELECT NOT EXISTS " + this.b.aj(null, list) + ")";
    }
}
