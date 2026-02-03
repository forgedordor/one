package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsei implements ejug {
    @Override // defpackage.ejug
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        if (obj != null) {
            etoo etooVar = (etoo) obj;
            if (etooVar.b == 1) {
                dsbm dsbmVar = ((dsdy) obj2).a;
                if (dsbmVar.b == 1) {
                    etkl etklVar = (etkl) dsbmVar.c;
                    etkl etklVar2 = (etkl) etooVar.c;
                    etkl etklVarA = dsen.a(etklVar);
                    etkl etklVarA2 = dsen.a(etklVar2);
                    if (etklVarA.c == etklVarA2.c && etklVarA.d == etklVarA2.d && etklVarA.e.equals(etklVarA2.e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
