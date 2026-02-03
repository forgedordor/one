package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.eyhq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upv extends uqt implements ehlg, eyhx, ehlc, ehnw, eifl {
    public final lvn a = new lvn(this);
    private boolean ag;
    private uqc d;
    private Context e;

    @Deprecated
    public upv() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return uqc.class;
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.a;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uqc H() {
        uqc uqcVar = this.d;
        if (uqcVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return uqcVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.c.f();
        try {
            aW(i, i2, intent);
            uqc uqcVarH = H();
            if (i == 1000) {
                if (i2 == -1) {
                    Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI") : null;
                    String string = parcelableExtra == null ? "" : parcelableExtra.toString();
                    bagb bagbVar = uqcVarH.c;
                    bagbVar.d.a(bagbVar.a, null, string, null, null).s();
                    cqca.i("Bugle", "user selected sound ".concat(String.valueOf(string)));
                } else {
                    cqca.i("Bugle", "user canceled sound selection");
                }
            }
            eifpVarF.close();
        } catch (Throwable th) {
            try {
                eifpVarF.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.uqt, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ejwl.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.uqt
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.e == null) {
            this.e = new ehnz(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    @Override // defpackage.uqt, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        eieu eieuVar;
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/conversation/settings/ConversationSettingsBaseFragment", 84, upv.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/conversation/settings/ConversationSettingsBaseFragment", 89, upv.class, "CreatePeer");
                        try {
                            eyik eyikVar = ((ahib) objBb).w;
                            ahho ahhoVar = ((ahib) objBb).b;
                            eyik eyikVar2 = ahhoVar.g;
                            ahkn ahknVar = ((ahib) objBb).a;
                            ahnh ahnhVar = ahknVar.a;
                            eyik eyikVar3 = ahnhVar.Uk;
                            eyik eyikVar4 = ((ahib) objBb).x;
                            eyik eyikVar5 = ahknVar.dL;
                            eygg eyggVarA = eyie.a(((ahib) objBb).y);
                            eyik eyikVar6 = ((ahib) objBb).B;
                            eyik eyikVar7 = ahhoVar.e;
                            eyie.a(ahnhVar.pd);
                            eygg eyggVarA2 = eyie.a(ahhoVar.cb);
                            eieuVar = eieuVarG2;
                            try {
                                eygg eyggVarA3 = eyie.a(((ahib) objBb).k);
                                eygg eyggVarA4 = eyie.a(((ahib) objBb).l);
                                eygg eyggVarA5 = eyie.a(ahhoVar.ai);
                                eyik eyikVar8 = ((ahib) objBb).z;
                                eygg eyggVarA6 = eyie.a(ahknVar.aI);
                                eygg eyggVarA7 = eyie.a(ahknVar.y);
                                eyik eyikVar9 = ahknVar.ie;
                                ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                                if (!(eaVar instanceof upv)) {
                                    throw new IllegalStateException(a.M(eaVar, uqc.class));
                                }
                                upv upvVar = (upv) eaVar;
                                eyik eyikVar10 = ahnhVar.WC;
                                eyik eyikVar11 = ahknVar.aQ;
                                Bundle bundleA = ((ahib) objBb).a();
                                evrr evrrVar = (evrr) ahknVar.b.gp.b();
                                ejwl.b(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                                upx upxVar = (upx) ProtoParsers.f(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", upx.a, evrrVar);
                                upxVar.getClass();
                                this.d = new uqc(eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyggVarA, eyikVar6, eyikVar7, eyggVarA2, eyggVarA3, eyggVarA4, eyggVarA5, eyikVar8, eyggVarA6, eyggVarA7, eyikVar9, upvVar, eyikVar10, eyikVar11, upxVar);
                                eieuVar.close();
                                this.Z.c(new ehns(this.c, this.a));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    eieuVar.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            eieuVar = eieuVarG2;
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aX(bundle);
            uqc uqcVarH = H();
            bagc bagcVar = (bagc) uqcVarH.l.b();
            ConversationIdType conversationIdType = uqcVarH.y;
            boolean z = uqcVarH.A;
            boolean z2 = uqcVarH.B;
            avoe avoeVar = uqcVarH.C;
            ayox ayoxVar = (ayox) bagcVar.a.b();
            ayoxVar.getClass();
            conversationIdType.getClass();
            avoeVar.getClass();
            uqcVarH.c = new bagb(ayoxVar, conversationIdType, z, z2);
            cqca.i("Bugle", "showing group options for conversation ".concat(String.valueOf(String.valueOf(conversationIdType))));
            eygg eyggVar = uqcVarH.q;
            ((egpr) eyggVar.b()).j(uqcVarH.E);
            ((egpr) eyggVar.b()).j(uqcVarH.F);
            ((egpr) eyggVar.b()).j(uqcVarH.I);
            ((egpr) eyggVar.b()).j(uqcVarH.G);
            ehac ehacVar = (ehac) uqcVarH.p.b();
            urw urwVar = (urw) uqcVarH.o.b();
            upv upvVar = uqcVarH.x;
            ehacVar.a(urwVar.a(upvVar.a, conversationIdType), uqcVarH.D);
            cukf cukfVar = (cukf) upvVar.G();
            if (cukfVar != null) {
                if (z) {
                    cukfVar.setTitle(R.string.people_and_options_activity_title_group);
                }
                cukfVar.k();
            }
            uqcVarH.d = new uql(uqcVarH);
            uqcVarH.e = new uqi(uqcVarH, ((Boolean) uqo.b.e()).booleanValue());
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ag = true;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.uqt, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
