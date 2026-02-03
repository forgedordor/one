package com.google.android.libraries.stickers.gallery;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import com.google.android.libraries.stickers.packdetails.PackDetailsActivity;
import defpackage.ebuo;
import defpackage.ebvd;
import defpackage.ebve;
import defpackage.ebxh;
import defpackage.ebxl;
import defpackage.etyp;
import defpackage.etyu;
import defpackage.iy;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class StickerGalleryActivity extends iy implements ebxh {
    private int n;
    private boolean o;
    private ebxl p;
    private boolean q = false;

    private final void I() {
        if (this.q || ebve.e(this)) {
            return;
        }
        this.q = true;
        runOnUiThread(new Runnable() { // from class: ebxb
            @Override // java.lang.Runnable
            public final void run() {
                final StickerGalleryActivity stickerGalleryActivity = this.a;
                eeji eejiVar = new eeji(stickerGalleryActivity);
                eejiVar.u(R.string.stickers_no_connection_alert_title);
                eejiVar.k(R.string.stickers_no_connection_alert_message);
                eejiVar.r(R.string.stickers_error_alert_ok, new DialogInterface.OnClickListener() { // from class: ebwz
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        stickerGalleryActivity.finish();
                    }
                });
                eejiVar.p(new DialogInterface.OnCancelListener() { // from class: ebxa
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        stickerGalleryActivity.finish();
                    }
                });
                eejiVar.create().show();
            }
        });
        Log.e("StickerGalleryActivity", "No internet connection.");
    }

    @Override // defpackage.ebxh
    public final void B() {
        finish();
    }

    @Override // defpackage.ebxh
    public final void C() {
        I();
    }

    @Override // defpackage.ebxh
    public final void D(etyp etypVar) {
        setResult(-1, new Intent().putExtra("sticker", etypVar.toByteArray()).putExtra("interaction_source", 3));
        finish();
    }

    @Override // defpackage.ebxh
    public final void E(etyu etyuVar) {
        Intent intent = new Intent(this, (Class<?>) PackDetailsActivity.class);
        intent.putExtra("sticker_pack", etyuVar.toByteArray());
        intent.putExtra("theme_mode", this.n);
        if (getCallingActivity() != null) {
            startActivityForResult(intent, 1);
        } else {
            startActivity(intent);
        }
    }

    @Override // defpackage.ebxh
    public final void F() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/collection/promotion_30029ba_stickers_apps_gboard"));
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("StickerGalleryActivity", "Failed to start play store stickers intent: ".concat(intent.toString()), e);
        }
    }

    @Override // defpackage.ebxh
    public final boolean G() {
        return ebvd.a(this.n);
    }

    @Override // defpackage.ebxh
    public final boolean H() {
        return this.o;
    }

    @Override // defpackage.eg, defpackage.abi, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // defpackage.abi, android.app.Activity
    public final void onBackPressed() {
        if (this.p.e()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        this.n = getIntent().getIntExtra("theme_mode", 0);
        if (G()) {
            setTheme(R.style.StickerDarkTheme);
        }
        super.onCreate(bundle);
        ((ebuo) getApplicationContext()).b();
        int intExtra = getIntent().getIntExtra("starting_page", 0);
        this.o = getIntent().getBooleanExtra("show_back_button", false);
        ebxl ebxlVar = new ebxl(this, this);
        this.p = ebxlVar;
        setContentView(ebxlVar);
        if (intExtra != 0) {
            ebxl ebxlVar2 = this.p;
            if (intExtra == 1) {
                ebxlVar2.e.k(0);
                ebxlVar2.c();
            } else if (intExtra == 2) {
                ebxlVar2.e.k(1);
                ebxlVar2.c();
            } else if (intExtra == 3) {
                ebxlVar2.d();
            }
        }
        if (Build.VERSION.SDK_INT >= 27) {
            ((LinearLayout) findViewById(R.id.action_bar_root).getParent().getParent()).setSystemUiVisibility(1280);
            getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ebwx
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return windowInsets;
                }
            });
            this.p.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ebwy
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                    return windowInsets;
                }
            });
        }
        I();
    }
}
