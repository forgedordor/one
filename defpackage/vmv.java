package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmv implements vdy {
    public final Context a;
    public final afzc b;
    public final Optional c;
    private final ahax d;
    private final apsf e;
    private final bxle f;
    private final fcsu g;
    private final fdpl h;
    private final Set i;

    public vmv(Context context, zqm zqmVar, afzc afzcVar, fcsu fcsuVar, Optional optional, ahax ahaxVar, apsf apsfVar, bxle bxleVar, fcsu fcsuVar2) {
        context.getClass();
        zqmVar.getClass();
        afzcVar.getClass();
        ahaxVar.getClass();
        bxleVar.getClass();
        this.a = context;
        this.b = afzcVar;
        this.c = optional;
        this.d = ahaxVar;
        this.e = apsfVar;
        this.f = bxleVar;
        this.g = fcsuVar2;
        this.h = new fdua(zqmVar.a(), ((Optional) fcsuVar.b()).isPresent() ? ((vlk) ((Optional) fcsuVar.b()).get()).b : new fdpu(false), new vmu(this, null));
        this.i = fcwm.d(zqx.b, zqx.c);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.i;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Intent c(ajlt ajltVar, Context context) throws IOException {
        Context context2;
        Uri uriB;
        String strC = vmw.c(ajltVar);
        boolean z = false;
        boolean z2 = (strC == null || fdgn.H(strC)) ? false : true;
        String strB = vmw.b(ajltVar);
        if (strB != null && !fdgn.H(strB)) {
            z = true;
        }
        boolean z3 = ajltVar.g() instanceof amsv;
        boolean z4 = ajltVar.g() instanceof amwa;
        if (!z2 && !z && !z3 && !z4) {
            throw new IllegalStateException("Nothing to share!");
        }
        Intent intent = new Intent("android.intent.action.SEND");
        amvr amvrVarG = ajltVar.g();
        if (amvrVarG instanceof amwa) {
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", ((amwa) amvrVarG).m());
            return intent;
        }
        if (amvrVarG instanceof amsv) {
            amsv amsvVar = (amsv) amvrVarG;
            apsf apsfVar = this.e;
            bxle bxleVar = this.f;
            boolean zA = ((eoth) ((aoxq) apsfVar).a.b()).a("bugle.enable_fix_for_sharing_camera_media");
            boolean z5 = amsvVar instanceof amvp;
            if (z5 && !vmw.f((amvp) amsvVar)) {
                context2 = context;
                uriB = null;
            } else if (amsvVar instanceof MediaContentItem) {
                if (zA) {
                    MediaContentItem mediaContentItem = (MediaContentItem) amsvVar;
                    Uri uriA = mediaContentItem.a();
                    uriA.getClass();
                    String strB2 = mediaContentItem.b();
                    strB2.getClass();
                    uriB = vmw.a(context, uriA, strB2);
                } else {
                    MediaContentItem mediaContentItem2 = (MediaContentItem) amsvVar;
                    if (bxlf.j(mediaContentItem2.a(), context) || cqmz.s(mediaContentItem2.a())) {
                        context2 = context;
                        uriB = bxli.b(context2, mediaContentItem2.a(), null, mediaContentItem2.b(), 0L);
                    } else {
                        uriB = mediaContentItem2.a();
                    }
                }
                context2 = context;
            } else {
                context2 = context;
                if (zA && (amsvVar instanceof amvy)) {
                    Uri uriE = amsvVar.e();
                    uriE.getClass();
                    String strB3 = amsvVar.b();
                    strB3.getClass();
                    uriB = vmw.a(context2, uriE, strB3);
                } else {
                    Uri uriE2 = amsvVar.e();
                    amvp amvpVar = z5 ? (amvp) amsvVar : null;
                    String strG = amvpVar != null ? amvpVar.g() : null;
                    String strA = le.a(amsvVar.b());
                    amvp amvpVar2 = z5 ? (amvp) amsvVar : null;
                    uriB = bxli.b(context2, uriE2, strG, strA, amvpVar2 != null ? amvpVar2.a() : 0L);
                }
            }
            if (fdbq.f(uriB != null ? uriB.getScheme() : null, "file") && uriB.getPath() != null) {
                String str = bxleVar.a;
                String path = uriB.getPath();
                if (path == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                uriB = FileProvider.a(context2, str, new File(path));
            }
            intent.putExtra("android.intent.extra.STREAM", uriB);
            intent.setType(ajltVar.g().b());
            String strR = ajltVar.r();
            if (strR != null) {
                intent.putExtra("android.intent.extra.TEXT", strR);
                return intent;
            }
        } else {
            if (!(amvrVarG instanceof amwf)) {
                throw new IllegalArgumentException("Unknown type for share!");
            }
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", vmw.c(ajltVar));
            String strB4 = vmw.b(ajltVar);
            if (strB4 != null && !fdgn.H(strB4)) {
                intent.putExtra("android.intent.extra.SUBJECT", strB4);
                intent.putExtra("extra_subject_mandatory", true);
            }
        }
        return intent;
    }

    public final void d(final ajlt ajltVar) {
        ajltVar.getClass();
        if (((Boolean) ((cczi) crtr.V.get()).e()).booleanValue()) {
            ((vjl) this.g.b()).a(ajltVar, new fdap() { // from class: vmp
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((ajlt) obj).getClass();
                    vmv vmvVar = this.a;
                    vmvVar.b.h(new agfs(vmvVar.c(ajltVar, vmvVar.a)));
                    return fctx.a;
                }
            });
            return;
        }
        if (crtr.e()) {
            String strB = ajltVar.g().b();
            strB.getClass();
            if (fdgn.t(strB, "image")) {
                this.c.isPresent();
                if (((amvy) ajltVar.g()).h() != amvx.DISPLAY) {
                    this.d.e(new fdap() { // from class: vmq
                        /* JADX WARN: Type inference failed for: r1v1, types: [aaef, java.lang.Object] */
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            final ahat ahatVar = (ahat) obj;
                            ahatVar.getClass();
                            final vmv vmvVar = this.a;
                            ?? r1 = vmvVar.c.get();
                            fdae fdaeVar = new fdae() { // from class: vmr
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ahatVar.a();
                                    return fctx.a;
                                }
                            };
                            final ajlt ajltVar2 = ajltVar;
                            return r1.a(fdaeVar, new fdae() { // from class: vms
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ahatVar.a();
                                    vmv vmvVar2 = vmvVar;
                                    vmvVar2.b.h(new agfs(vmvVar2.c(ajltVar2, vmvVar2.a)));
                                    return fctx.a;
                                }
                            });
                        }
                    });
                    return;
                }
            }
        }
        this.b.h(new agfs(c(ajltVar, this.a)));
    }
}
