package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cyvb extends cyve {
    public long H;
    public boolean I;
    public cogw J;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private Long N;
    public AttachmentQueueState n;

    private final emss D() {
        emsn emsnVar = (emsn) emss.a.createBuilder();
        emsp emspVarM = M();
        emsnVar.copyOnWrite();
        emss emssVar = (emss) emsnVar.instance;
        emssVar.c = emspVarM.v;
        emssVar.b |= 1;
        emsr emsrVar = emsr.EXPANDED;
        emsnVar.copyOnWrite();
        emss emssVar2 = (emss) emsnVar.instance;
        emssVar2.d = emsrVar.e;
        emssVar2.b |= 2;
        return (emss) emsnVar.build();
    }

    private final void F() {
        AttachmentQueueState attachmentQueueState = this.n;
        if (attachmentQueueState != null) {
            attachmentQueueState.c(N());
        }
    }

    protected abstract emsp M();

    protected abstract Class N();

    public final void ae(emsh emshVar) {
        if (!this.K) {
            af(emsl.INTERRUPTED);
        }
        if (this.L) {
            return;
        }
        emss emssVarD = D();
        F();
        if (!this.M) {
            cqaz.l(this.N);
            this.J.f().toEpochMilli();
            Long l = this.N;
            if (l != null) {
                l.longValue();
            }
        }
        ekrd ekrdVar = (ekrd) aiqo.a.j();
        ekrdVar.Z(eksk.MEDIUM);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger", "deprecatedLogScreenClosed", 143, "ComposeNavigationEventLogger.java")).B("ComposeNavigationEventLogger.deprecatedLogScreenClosed 3 %s, %s", emssVarD, emshVar.h);
        this.L = true;
    }

    public final void af(emsl emslVar) {
        emsj emsjVar;
        if (this.K) {
            return;
        }
        this.N = Long.valueOf(this.J.f().toEpochMilli());
        emss emssVarD = D();
        F();
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("EXTRA_OPENING_SOURCE")) {
            emsjVar = emsj.UNKNOWN_OPENING_SOURCE;
        } else {
            try {
                String stringExtra = intent.getStringExtra("EXTRA_OPENING_SOURCE");
                stringExtra.getClass();
                emsjVar = (emsj) Enum.valueOf(emsj.class, stringExtra);
            } catch (IllegalArgumentException e) {
                Object[] objArr = {intent.getStringExtra("EXTRA_OPENING_SOURCE")};
                ekrd ekrdVar = (ekrd) cqca.a.i();
                ekrdVar.X(eksq.a, "Bugle");
                ekrdVar.Y(ekrq.a);
                ((ekrd) ((ekrd) ekrdVar.g(e)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "e", 511, "LogUtil.java")).P("Invalid opening source %s", objArr);
            }
        }
        ekrd ekrdVar2 = (ekrd) aiqo.a.j();
        ekrdVar2.Z(eksk.MEDIUM);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger", "deprecatedLogScreenOpened", 83, "ComposeNavigationEventLogger.java")).I("ComposeNavigationEventLogger.deprecatedLogScreenOpened 3 %s, %s, %s", emssVarD, emslVar, Integer.valueOf(emsjVar.r));
        this.K = true;
        this.M = emslVar == emsl.INTERRUPTED;
    }

    @Override // defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c().b(this, new cyva(this));
        im imVarK = k();
        if (imVarK != null) {
            imVarK.setDisplayHomeAsUpEnabled(true);
        }
        this.n = (AttachmentQueueState) getIntent().getParcelableExtra("draft_message_data");
        if (((Boolean) daor.a.e()).booleanValue()) {
            this.H = getIntent().getIntExtra("EXTRA_MAX_ATTACHMENT_SIZE", -1);
        }
        this.I = getIntent().getBooleanExtra("EXTRA_IS_RCS_ON_OPEN", false);
        getIntent().getLongExtra("EXTRA_OPENING_TIME", this.J.f().toEpochMilli());
    }

    @Override // defpackage.cukf, defpackage.ecdl, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ae(emsh.BACK_ICON);
        c().d();
        return true;
    }
}
