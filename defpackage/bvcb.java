package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvcb extends dqpg {
    public String a;
    public aonp b;
    public String c;
    public String d;

    public bvcb() {
        super(VmtTable.d());
        this.b = aonp.VMT_STATUS_UNKNOWN;
    }

    public final VmtTable.BindData a() {
        bvca bvcaVar = new bvca();
        bvcaVar.aD(aB());
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("field part_id cannot be null");
        }
        bvcaVar.a = str;
        bvcaVar.b = this.b;
        bvcaVar.c = this.c;
        bvcaVar.d = this.d;
        bvcaVar.cM = aC();
        return bvcaVar;
    }

    public final void b(String str) {
        aE(3);
        this.d = str;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }

    public final void e(aonp aonpVar) {
        aE(1);
        this.b = aonpVar;
    }
}
