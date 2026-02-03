package com.google.android.apps.messaging.ui;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.ClassZeroActivity;
import defpackage.ains;
import defpackage.aycg;
import defpackage.cqaz;
import defpackage.crny;
import defpackage.cuhe;
import defpackage.cuji;
import defpackage.cujk;
import defpackage.eeji;
import defpackage.fcsu;
import defpackage.iv;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClassZeroActivity extends cujk {
    public fcsu n;
    public fcsu o;
    public aycg r;
    private ContentValues y = null;
    public boolean p = false;
    private long z = 0;
    public iv q = null;
    private ArrayList A = null;
    private final Handler B = new cuji(this);
    private final DialogInterface.OnClickListener C = new DialogInterface.OnClickListener() { // from class: cujg
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ClassZeroActivity classZeroActivity = this.a;
            ((ains) classZeroActivity.n.b()).e("Bugle.Sms.ClassZero.Class.MessageDismissed", classZeroActivity.D());
            classZeroActivity.F();
        }
    };
    private final DialogInterface.OnClickListener D = new DialogInterface.OnClickListener() { // from class: cujh
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            ClassZeroActivity classZeroActivity = this.a;
            classZeroActivity.p = true;
            classZeroActivity.G();
            dialogInterface.dismiss();
            classZeroActivity.F();
        }
    };

    private final void H(ContentValues contentValues) {
        this.y = contentValues;
        String asString = contentValues.getAsString("body");
        eeji eejiVar = new eeji(this);
        eejiVar.l(asString);
        eejiVar.r(R.string.save, this.D);
        eejiVar.m(android.R.string.cancel, this.C);
        eejiVar.u(R.string.class_0_message_activity);
        eejiVar.i(false);
        this.q = eejiVar.a();
        this.z = SystemClock.uptimeMillis() + 300000;
        ((ains) this.n.b()).e("Bugle.Sms.ClassZero.Class.ActivityCreated", D());
    }

    private final boolean J(Intent intent) {
        ContentValues contentValues = (ContentValues) intent.getParcelableExtra("message_values");
        if (!TextUtils.isEmpty(contentValues.getAsString("body"))) {
            this.A.add(contentValues);
            return true;
        }
        if (!this.A.isEmpty()) {
            return false;
        }
        finish();
        return false;
    }

    public final int D() {
        ContentValues contentValues = this.y;
        Integer asInteger = contentValues != null ? contentValues.getAsInteger("sub_id") : null;
        if (asInteger == null) {
            asInteger = -1;
        }
        return ((Integer) Optional.ofNullable(((crny) this.o.b()).h(asInteger.intValue()).v()).map(new Function() { // from class: cujf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return eonc.g((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(0)).intValue();
    }

    public final void F() {
        if (!this.A.isEmpty()) {
            this.A.remove(0);
        }
        if (this.A.isEmpty()) {
            finish();
        } else {
            H((ContentValues) this.A.get(0));
        }
    }

    public final void G() {
        this.y.put("read", Integer.valueOf(this.p ? 1 : 0));
        this.r.a(this.y).s();
        ((ains) this.n.b()).e("Bugle.Sms.ClassZero.Class.MessageSaved", D());
    }

    @Override // defpackage.cukc
    public final cuhe fa() {
        return cuhe.i;
    }

    @Override // defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (this.A == null) {
            this.A = new ArrayList();
        }
        if (J(getIntent())) {
            cqaz.a(1, this.A.size());
            if (this.A.size() == 1) {
                H((ContentValues) this.A.get(0));
            }
            if (bundle != null) {
                this.z = bundle.getLong("timer_fire", this.z);
            }
        }
    }

    @Override // defpackage.ecdl, defpackage.abi, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        J(intent);
    }

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("timer_fire", this.z);
    }

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStart() {
        super.onStart();
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.z;
        if (j <= jUptimeMillis) {
            this.B.sendEmptyMessage(1);
        } else {
            this.B.sendEmptyMessageAtTime(1, j);
        }
    }

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStop() {
        super.onStop();
        this.B.removeMessages(1);
    }
}
