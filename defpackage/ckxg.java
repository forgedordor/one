package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxg {
    public static final /* synthetic */ int a = 0;
    private static final ejxk b = ejxk.e("_");

    public static embv a(String str) throws NumberFormatException {
        List listI = b.i(str);
        if (listI.size() > 3) {
            embv embvVar = (embv) embx.a.createBuilder();
            try {
                elpw elpwVar = (elpw) elpy.a.createBuilder();
                int i = Integer.parseInt((String) listI.get(1));
                elpwVar.copyOnWrite();
                elpy elpyVar = (elpy) elpwVar.instance;
                elpyVar.b |= 1;
                elpyVar.c = i;
                int i2 = Integer.parseInt((String) listI.get(2));
                elpwVar.copyOnWrite();
                elpy elpyVar2 = (elpy) elpwVar.instance;
                elpyVar2.b |= 2;
                elpyVar2.d = i2;
                embvVar.copyOnWrite();
                embx embxVar = (embx) embvVar.instance;
                elpy elpyVar3 = (elpy) elpwVar.build();
                elpyVar3.getClass();
                embxVar.c = elpyVar3;
                embxVar.b |= 1;
                int i3 = Integer.parseInt((String) listI.get(3));
                embvVar.copyOnWrite();
                embx embxVar2 = (embx) embvVar.instance;
                embxVar2.b |= 2;
                embxVar2.d = i3;
                if (listI.size() <= 4) {
                    embvVar.copyOnWrite();
                    embx embxVar3 = (embx) embvVar.instance;
                    embxVar3.b |= 4;
                    embxVar3.e = 0;
                    return embvVar;
                }
                if (!((String) listI.get(4)).equals(ejxq.b("X", ((String) listI.get(4)).length()))) {
                    embvVar.copyOnWrite();
                    embx embxVar4 = (embx) embvVar.instance;
                    embxVar4.b |= 4;
                    embxVar4.e = -1;
                    return embvVar;
                }
                int length = ((String) listI.get(4)).length();
                embvVar.copyOnWrite();
                embx embxVar5 = (embx) embvVar.instance;
                embxVar5.b = 4 | embxVar5.b;
                embxVar5.e = length;
                return embvVar;
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static embv b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr);
        if (str.endsWith(".xml")) {
            return a(str.substring(0, str.length() - 4));
        }
        return null;
    }
}
