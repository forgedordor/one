package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eknn {
    static boolean a(ekni ekniVar, Object obj) {
        if (obj == ekniVar) {
            return true;
        }
        if (obj instanceof ekni) {
            ekni ekniVar2 = (ekni) obj;
            if (ekniVar.size() == ekniVar2.size() && ekniVar.j().size() == ekniVar2.j().size()) {
                for (eknh eknhVar : ekniVar2.j()) {
                    if (ekniVar.b(eknhVar.b()) != eknhVar.a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
