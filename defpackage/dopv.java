package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dopv extends fcyz implements fdat {
    final /* synthetic */ doqi a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dopv(doqi doqiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = doqiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dopv) c((eaik) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        eaik eaikVar = (eaik) this.b;
        eahp eahpVar = eahp.a;
        eaho eahoVar = (eaho) eahpVar.createBuilder();
        eahoVar.getClass();
        eahoVar.copyOnWrite();
        eahp eahpVar2 = (eahp) eahoVar.instance;
        eahpVar2.b |= 1;
        eahpVar2.c = this.a.a;
        evsn evsnVarBuild = eahoVar.build();
        evsnVarBuild.getClass();
        eahp eahpVar3 = (eahp) evsnVarBuild;
        fbrg fbrgVar = new fbrg();
        fbnd fbndVar = eaikVar.a;
        fbrk fbrkVar = eaih.c;
        if (fbrkVar == null) {
            synchronized (eaih.class) {
                fbrkVar = eaih.c;
                if (fbrkVar == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.SERVER_STREAMING;
                    fbrhVarA.d = fbrk.c("com.google.android.libraries.photos.share.apiservice.proto.PhotosMediaShareService", "ObserveLinkSharedAlbumRequestStatus");
                    fbrhVarA.b();
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eahpVar);
                    fbrhVarA.b = new fcrh(eahx.a);
                    fbrk fbrkVarA = fbrhVarA.a();
                    eaih.c = fbrkVarA;
                    fbrkVar = fbrkVarA;
                }
            }
        }
        return fcnh.a(fbndVar, fbrkVar, eahpVar3, eaikVar.b, fbrgVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dopv dopvVar = new dopv(this.a, fcxyVar);
        dopvVar.b = obj;
        return dopvVar;
    }
}
