package defpackage;

import android.provider.MediaStore;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbfe implements lun {
    private static final cczi e = cdag.f(cdag.b, "p2p_share_recent_image_age_limit_millis", TimeUnit.MINUTES.toMillis(1));
    public final bbfg b;
    public long d;
    private final cogw f;
    private final crma g;
    private final crej h;
    private final egxv i;
    private final egxm j;
    public final Set a = new HashSet();
    private boolean k = false;
    public ConversationIdType c = barn.a;

    public bbfe(egxv egxvVar, cogw cogwVar, crma crmaVar, crej crejVar, bbfg bbfgVar, eigp eigpVar) {
        this.i = egxvVar;
        this.b = bbfgVar;
        this.j = new bbfd(this, eigpVar);
        this.f = cogwVar;
        this.g = crmaVar;
        this.h = crejVar;
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        if (this.h.i() && this.g.q() && !this.c.b()) {
            long epochMilli = this.f.f().toEpochMilli() - ((Long) e.e()).longValue();
            this.d = epochMilli;
            if (this.k) {
                return;
            }
            this.b.a(this.c, null, epochMilli, this.a);
            this.k = true;
            this.i.d(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.j);
        }
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        if (this.k) {
            this.k = false;
            this.i.e(this.j);
            this.c = barn.a;
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
