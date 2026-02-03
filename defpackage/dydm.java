package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dydm extends dydh {
    public final Context a;
    public final dydi b;
    public final dxxk c;
    public final dycy d;
    public final dyif e;
    public final dywb f;
    public final dyib g;
    public final ejwi h;
    public final dxyj i;
    public final ExecutorService j;
    public final dyyb k;
    public final dyws l;
    public final ejwi m;
    private final dxyj n;
    private final dtah o;
    private final ejwi p;

    public dydm(Context context, dydi dydiVar, dxxk dxxkVar, dycy dycyVar, dyif dyifVar, dywb dywbVar, dyib dyibVar, ejwi ejwiVar, dxyj dxyjVar, dxyj dxyjVar2, ExecutorService executorService, dtah dtahVar, dyyb dyybVar, dyws dywsVar, ejwi ejwiVar2, ejwi ejwiVar3) {
        this.a = context;
        this.b = dydiVar;
        this.c = dxxkVar;
        this.d = dycyVar;
        this.e = dyifVar;
        this.f = dywbVar;
        this.g = dyibVar;
        this.h = ejwiVar;
        this.n = dxyjVar;
        this.i = dxyjVar2;
        this.j = executorService;
        this.o = dtahVar;
        this.k = dyybVar;
        this.l = dywsVar;
        this.m = ejwiVar2;
        this.p = ejwiVar3;
    }

    @Override // defpackage.dydh
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.dydh
    public final dtah b() {
        return this.o;
    }

    @Override // defpackage.dydh
    public final dxxk c() {
        return this.c;
    }

    @Override // defpackage.dydh
    public final dxyj d() {
        return this.i;
    }

    @Override // defpackage.dydh
    public final dxyj e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        dxyj dxyjVar;
        dyws dywsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dydh) {
            dydh dydhVar = (dydh) obj;
            if (this.a.equals(dydhVar.a()) && this.b.equals(dydhVar.g()) && this.c.equals(dydhVar.c()) && this.d.equals(dydhVar.f()) && this.e.equals(dydhVar.i())) {
                dydhVar.r();
                if (this.f.equals(dydhVar.j()) && this.g.equals(dydhVar.h()) && this.h.equals(dydhVar.n()) && ((dxyjVar = this.n) != null ? dxyjVar.equals(dydhVar.e()) : dydhVar.e() == null) && this.i.equals(dydhVar.d())) {
                    dydhVar.q();
                    if (this.j.equals(dydhVar.p()) && this.o.equals(dydhVar.b()) && this.k.equals(dydhVar.l()) && ((dywsVar = this.l) != null ? dywsVar.equals(dydhVar.k()) : dydhVar.k() == null) && this.m.equals(dydhVar.m()) && this.p.equals(dydhVar.o())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dydh
    public final dycy f() {
        return this.d;
    }

    @Override // defpackage.dydh
    public final dydi g() {
        return this.b;
    }

    @Override // defpackage.dydh
    public final dyib h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * (-721379959)) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
        dxyj dxyjVar = this.n;
        int iHashCode2 = ((((((((((((iHashCode * 1000003) ^ 2040732332) * 1000003) ^ (dxyjVar == null ? 0 : dxyjVar.hashCode())) * 1000003) ^ this.i.hashCode()) * (-721379959)) ^ this.j.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        dyws dywsVar = this.l;
        return ((((iHashCode2 ^ (dywsVar != null ? dywsVar.hashCode() : 0)) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    @Override // defpackage.dydh
    public final dyif i() {
        return this.e;
    }

    @Override // defpackage.dydh
    public final dywb j() {
        return this.f;
    }

    @Override // defpackage.dydh
    public final dyws k() {
        return this.l;
    }

    @Override // defpackage.dydh
    public final dyyb l() {
        return this.k;
    }

    @Override // defpackage.dydh
    public final ejwi m() {
        return this.m;
    }

    @Override // defpackage.dydh
    public final ejwi n() {
        return this.h;
    }

    @Override // defpackage.dydh
    public final ejwi o() {
        return this.p;
    }

    @Override // defpackage.dydh
    public final ExecutorService p() {
        return this.j;
    }

    public final String toString() {
        dyws dywsVar = this.l;
        dyyb dyybVar = this.k;
        dtah dtahVar = this.o;
        ExecutorService executorService = this.j;
        dxyj dxyjVar = this.i;
        dxyj dxyjVar2 = this.n;
        dyib dyibVar = this.g;
        dywb dywbVar = this.f;
        dyif dyifVar = this.e;
        dycy dycyVar = this.d;
        dxxk dxxkVar = this.c;
        dydi dydiVar = this.b;
        return "AccountMenuManager{applicationContext=" + this.a.toString() + ", accountsModel=" + dydiVar.toString() + ", accountConverter=" + dxxkVar.toString() + ", clickListeners=" + dycyVar.toString() + ", features=" + dyifVar.toString() + ", avatarRetriever=null, oneGoogleEventLogger=" + dywbVar.toString() + ", configuration=" + dyibVar.toString() + ", incognitoModel=Optional.absent(), customAvatarImageLoader=" + String.valueOf(dxyjVar2) + ", avatarImageLoader=" + dxyjVar.toString() + ", accountClass=null, backgroundExecutor=" + executorService.toString() + ", vePrimitives=" + dtahVar.toString() + ", visualElements=" + dyybVar.toString() + ", oneGoogleStreamz=" + String.valueOf(dywsVar) + ", appIdentifier=Optional.absent(), veAuthSideChannelGetter=Optional.absent()}";
    }

    @Override // defpackage.dydh
    @Deprecated
    public final void q() {
    }

    @Override // defpackage.dydh
    public final void r() {
    }
}
