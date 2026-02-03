package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.ukm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukx {
    public static final doxc a(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        ukw ukwVar = (ukw) fcsuVar3.b();
        Integer numValueOf = ukwVar.b() ? Integer.valueOf(R.drawable.shortcuts_screen_background) : null;
        fcww fcwwVar = new fcww((byte[]) null);
        fcwwVar.add(new doxa(R.string.camera_gallery_shortcut_title, new dowz(R.drawable.ic_compose_camera_gallery_unselected_v2, new dowy(ukwVar.a(R.color.camera_gallery_shortcut_background), new dpxb(R.color.camera_gallery_shortcut_icon_tint))), null, new fdap() { // from class: ukp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                View view = (View) obj;
                if (view == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                einf.g(new ukm.a(view), view);
                return fctx.a;
            }
        }, 12));
        if (((Boolean) ujw.c.e()).booleanValue()) {
            if (ujw.b()) {
                fcwwVar.add(new doxa(R.string.gifs_shortcut_title, new dowz(R.drawable.gifs_shortcut_icon, new dowy(ukwVar.a(R.color.gifs_shortcut_background), new dpxb(R.color.gifs_shortcut_icon_tint))), null, new fdap() { // from class: ukq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        View view = (View) obj;
                        if (view == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        einf.g(new ukm.d(view, dpxe.c), view);
                        return fctx.a;
                    }
                }, 12));
            }
            if (ujw.c()) {
                fcwwVar.add(new doxa(R.string.stickers_shortcut_title, new dowz(R.drawable.quantum_gm_ic_sticker_vd_theme_24, new dowy(ukwVar.a(R.color.stickers_shortcut_background), new dpxb(R.color.stickers_shortcut_icon_tint))), null, new fdap() { // from class: ukr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        View view = (View) obj;
                        if (view == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        einf.g(new ukm.d(view, dpxe.f), view);
                        return fctx.a;
                    }
                }, 12));
            }
        }
        fcwwVar.add(new doxa(R.string.files_shortcut_title, new dowz(R.drawable.quantum_gm_ic_attach_file_vd_theme_24, new dowy(ukwVar.a(R.color.files_shortcut_background), new dpxb(R.color.files_shortcut_icon_tint))), null, new fdap() { // from class: uks
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                View view = (View) obj;
                if (view == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                einf.g(new ukm.c(view), view);
                return fctx.a;
            }
        }, 12));
        if (ukwVar.a.isPresent()) {
            fcwwVar.add(new doxa(R.string.location_shortcut_title, new dowz(R.drawable.quantum_gm_ic_place_vd_theme_24, new dowy(ukwVar.a(R.color.location_shortcut_background), new dpxb(R.color.location_shortcut_icon_tint))), fcva.b(dngy.b), new fdap() { // from class: ukt
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    View view = (View) obj;
                    if (view == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    einf.g(new ukm.e(view), view);
                    return fctx.a;
                }
            }, 4));
        }
        fcwwVar.add(new doxa(R.string.contacts_shortcut_title, new dowz(R.drawable.quantum_gm_ic_person_vd_theme_24, new dowy(ukwVar.a(R.color.contacts_shortcut_background), new dpxb(R.color.contacts_shortcut_icon_tint))), null, new fdap() { // from class: uku
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                View view = (View) obj;
                if (view == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                einf.g(new ukm.b(view), view);
                return fctx.a;
            }
        }, 12));
        if (((Boolean) clpp.a.e()).booleanValue()) {
            fcwwVar.add(new doxa(R.string.scheduled_send_shortcut_title, new dowz(R.drawable.quantum_gm_ic_schedule_vd_theme_24, new dowy(ukwVar.a(R.color.scheduled_send_shortcut_background), new dpxb(R.color.scheduled_send_shortcut_icon_tint))), null, new fdap() { // from class: ukv
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    View view = (View) obj;
                    if (view == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    einf.g(new ukm.f(view), view);
                    return fctx.a;
                }
            }, 12));
        }
        return new doxc(fcva.a(fcwwVar), numValueOf);
    }
}
