package com.google.android.apps.messaging.ui.ditto;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.ditto.DittoNotificationsActivity;
import defpackage.ains;
import defpackage.crqv;
import defpackage.cukg;
import defpackage.cyox;
import defpackage.im;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DittoNotificationsActivity extends cyox {
    public SwitchCompat H;
    public crqv I;
    public ains J;
    public Optional K;
    private View L;
    private View M;
    public SwitchCompat n;

    @Override // defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ditto_notifications);
        View viewFindViewById = findViewById(R.id.connected_to_web_setting);
        this.L = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: cynw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                DittoNotificationsActivity dittoNotificationsActivity = this.a;
                boolean zIsChecked = dittoNotificationsActivity.n.isChecked();
                boolean z = !zIsChecked;
                dittoNotificationsActivity.I.h("ditto_persistent_notification_channel_pre_o_enabled", z);
                dittoNotificationsActivity.n.setChecked(z);
                dittoNotificationsActivity.J.e("Bugle.Ditto.Notification.Status", true == zIsChecked ? 2 : 1);
                if (zIsChecked) {
                    dittoNotificationsActivity.K.ifPresent(new Consumer() { // from class: cyny
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((ceov) obj).a();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }
        });
        this.n = (SwitchCompat) findViewById(R.id.connected_to_web_switch_button);
        View viewFindViewById2 = findViewById(R.id.while_using_web_setting);
        this.M = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: cynx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                DittoNotificationsActivity dittoNotificationsActivity = this.a;
                boolean z = !dittoNotificationsActivity.H.isChecked();
                dittoNotificationsActivity.I.h("ditto_while_connected_notification_channel_enabled", z);
                dittoNotificationsActivity.H.setChecked(z);
            }
        });
        this.H = (SwitchCompat) findViewById(R.id.while_using_web_switch_button);
        im imVarK = k();
        if (imVarK != null) {
            cukg.c(this, imVarK, R.string.ditto_settings_action_bar_title);
            imVarK.setDisplayHomeAsUpEnabled(true);
        }
        this.n.setChecked(this.I.q("ditto_persistent_notification_channel_pre_o_enabled", true));
        this.H.setChecked(this.I.q("ditto_while_connected_notification_channel_enabled", true));
    }

    @Override // defpackage.cukf, defpackage.ecdl, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        c().d();
        return true;
    }
}
