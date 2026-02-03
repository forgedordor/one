package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ksh extends krz {
    public ArrayList aL;

    public ksh() {
        this.aL = new ArrayList();
    }

    public void ae() {
        ArrayList arrayList = this.aL;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            krz krzVar = (krz) this.aL.get(i);
            if (krzVar instanceof ksh) {
                ((ksh) krzVar).ae();
            }
        }
    }

    public final void am(krz krzVar) {
        this.aL.add(krzVar);
        krz krzVar2 = krzVar.ae;
        if (krzVar2 != null) {
            ((ksh) krzVar2).an(krzVar);
        }
        krzVar.ae = this;
    }

    public final void an(krz krzVar) {
        this.aL.remove(krzVar);
        krzVar.u();
    }

    public final void ao() {
        this.aL.clear();
    }

    @Override // defpackage.krz
    public void u() {
        this.aL.clear();
        super.u();
    }

    @Override // defpackage.krz
    public final void x(kqd kqdVar) {
        super.x(kqdVar);
        int size = this.aL.size();
        for (int i = 0; i < size; i++) {
            ((krz) this.aL.get(i)).x(kqdVar);
        }
    }

    public ksh(byte[] bArr) {
        super(0, 0);
        this.aL = new ArrayList();
    }
}
