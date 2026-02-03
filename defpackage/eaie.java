package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaie {
    private static volatile fbrk a;
    private static volatile fbsy b;

    private eaie() {
    }

    public static fbrk a() {
        fbrk fbrkVarA;
        fbrk fbrkVar = a;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (eaie.class) {
            fbrkVarA = a;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("com.google.android.libraries.photos.share.apiservice.proto.PhotosMediaShareClientCallback", "LinkSharedAlbumStatusUpdate");
                fbrhVarA.b();
                eahv eahvVar = eahv.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(eahvVar);
                fbrhVarA.b = new fcrh(eahf.a);
                fbrkVarA = fbrhVarA.a();
                a = fbrkVarA;
            }
        }
        return fbrkVarA;
    }

    public static fbsy b() {
        fbsy fbsyVar;
        fbsy fbsyVar2 = b;
        if (fbsyVar2 != null) {
            return fbsyVar2;
        }
        synchronized (eaie.class) {
            fbsyVar = b;
            if (fbsyVar == null) {
                fbsx fbsxVar = new fbsx("com.google.android.libraries.photos.share.apiservice.proto.PhotosMediaShareClientCallback");
                fbsxVar.a(a());
                fbsyVar = new fbsy(fbsxVar);
                b = fbsyVar;
            }
        }
        return fbsyVar;
    }
}
