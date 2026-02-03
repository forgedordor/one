package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.DateUtils;
import android.util.Size;
import com.google.android.apps.messaging.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytj implements ykl {
    public final yvq a;
    public final zih b;
    public final zqm c;
    private final Context d;
    private final aqkb e;

    public ytj(Context context, yvq yvqVar, zih zihVar, zqm zqmVar, aqkb aqkbVar) {
        context.getClass();
        yvqVar.getClass();
        zihVar.getClass();
        zqmVar.getClass();
        this.d = context;
        this.a = yvqVar;
        this.b = zihVar;
        this.c = zqmVar;
        this.e = aqkbVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ dkgq a(ykp ykpVar) throws IOException {
        Object djrpVar;
        ytg ytgVar = (ytg) ykpVar;
        eieu eieuVarH = eiiy.h("GalleryBubbleUiAdapter#createUiData");
        try {
            final List list = ytgVar.a.a;
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    djrj djrjVar = new djrj(fcva.aj(arrayList), new djri(ytgVar.d, this.e.a()), ytgVar.b, new fdae() { // from class: djrf
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            return fctx.a;
                        }
                    });
                    fczl.a(eieuVarH, null);
                    return djrjVar;
                }
                final ajlt ajltVar = (ajlt) it.next();
                String str = ytgVar.c;
                boolean z = ytgVar.d;
                amvr amvrVarG = ajltVar.g();
                if (!(amvrVarG instanceof amvy)) {
                    throw new IllegalStateException("Content is not photo or video, content-type: ".concat(String.valueOf(amvrVarG.b())));
                }
                String strB = amvrVarG.b();
                final amvy amvyVar = (amvy) amvrVarG;
                Size sizeF = amvyVar.f();
                List listG = fcva.g(sizeF.getWidth() == 0 ? null : Integer.valueOf(sizeF.getWidth()), sizeF.getHeight() == 0 ? null : Integer.valueOf(sizeF.getHeight()));
                Integer num = (Integer) listG.get(0);
                Integer num2 = (Integer) listG.get(1);
                if (le.m(strB)) {
                    djrpVar = new djrk(amvyVar.e(), String.valueOf(this.d.getString(R.string.photo_item_content_description)).concat(str), num, num2, new fdae() { // from class: yti
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            ytj ytjVar = this.a;
                            zqm zqmVar = ytjVar.c;
                            List list2 = list;
                            if (zqmVar.e()) {
                                zqmVar.c(list2);
                            } else {
                                amvy amvyVar2 = amvyVar;
                                ajlt ajltVar2 = ajltVar;
                                yvq yvqVar = ytjVar.a;
                                yvqVar.x.a(ajltVar2, fcva.aj(list2), amvyVar2.e(), amvyVar2.b());
                            }
                            return fctx.a;
                        }
                    });
                } else {
                    if (!le.z(strB)) {
                        throw new IllegalStateException("Unknown PhotoVideoContent, content-type: ".concat(String.valueOf(strB)));
                    }
                    djrpVar = new djrp(amvyVar.e(), String.valueOf(this.d.getString(R.string.video_item_content_description)).concat(str), num, num2, new fdae() { // from class: yth
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            ytj ytjVar = this.a;
                            zqm zqmVar = ytjVar.c;
                            List list2 = list;
                            if (zqmVar.e()) {
                                zqmVar.c(list2);
                            } else {
                                amvy amvyVar2 = amvyVar;
                                ajlt ajltVar2 = ajltVar;
                                zih zihVar = ytjVar.b;
                                List listAj = fcva.aj(list2);
                                Uri uriE = amvyVar2.e();
                                String strB2 = amvyVar2.b();
                                long j = fdhi.a;
                                zihVar.v.a(ajltVar2, listAj, uriE, strB2, new fdhi(0L), true);
                            }
                            return fctx.a;
                        }
                    }, amvyVar.k().isPresent() ? DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(((Number) amvyVar.k().get()).longValue())) : null, new djro(z));
                }
                arrayList.add(djrpVar);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }
}
