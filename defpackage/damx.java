package defpackage;

import com.google.android.apps.messaging.util.examplestore.MessagesExampleStoreService;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class damx extends ddjb implements eyhy {
    private volatile eyho a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyho ba() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new eyho(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            MessagesExampleStoreService messagesExampleStoreService = (MessagesExampleStoreService) this;
            ahij ahijVar = (ahij) bb();
            ahkn ahknVar = ahijVar.b;
            Optional optional = (Optional) ahknVar.mC.b();
            eyik eyikVar = ahijVar.r;
            eyik eyikVar2 = ahknVar.t;
            ahnh ahnhVar = ahknVar.a;
            eyik eyikVar3 = ahnhVar.uE;
            eyik eyikVar4 = ahnhVar.uJ;
            eyik eyikVar5 = ahnhVar.yx;
            eyik eyikVar6 = ahnhVar.BQ;
            eyik eyikVar7 = ahknVar.y;
            eyik eyikVar8 = ahknVar.p;
            eyik eyikVarA = eyil.a(ahnhVar.Hp);
            eyik eyikVar9 = ahknVar.cD;
            eyik eyikVar10 = ahknVar.aI;
            messagesExampleStoreService.a = new damy(optional, eyikVar, new dann(eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyikVar7, eyikVar8, eyikVarA, eyikVar9, ahnhVar.Cb, eyikVar, eyikVar10), ahijVar.s, ahijVar.t);
            messagesExampleStoreService.b = (eigp) eyikVar10.b();
        }
        super.onCreate();
    }
}
