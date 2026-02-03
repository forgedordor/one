package defpackage;

import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpxe {
    public static final dpxe a;
    public static final dpxe b;
    public static final dpxe c;
    public static final dpxe d;
    public static final dpxe e;
    public static final dpxe f;
    public static final dpxe g;
    public static final dpxe h;
    public static final dpxe i;
    public static final /* synthetic */ fcza j;
    private static final /* synthetic */ dpxe[] l;
    public final int k;

    static {
        dpxe dpxeVar = new dpxe("CAMERA_GALLERY", 0, R.string.camera_gallery_screen_title);
        a = dpxeVar;
        dpxe dpxeVar2 = new dpxe("EMOJI", 1, R.string.emoji_screen_title);
        b = dpxeVar2;
        dpxe dpxeVar3 = new dpxe("GIFS", 2, R.string.gif_screen_title);
        c = dpxeVar3;
        dpxe dpxeVar4 = new dpxe("PROXY", 3, R.string.proxy_screen_title);
        d = dpxeVar4;
        dpxe dpxeVar5 = new dpxe("SHORTCUTS", 4, R.string.shortcuts_screen_title);
        e = dpxeVar5;
        dpxe dpxeVar6 = new dpxe("STICKERS", 5, R.string.sticker_screen_title);
        f = dpxeVar6;
        dpxe dpxeVar7 = new dpxe(VCardConstants.PARAM_TYPE_VOICE, 6, R.string.voice_screen_title);
        g = dpxeVar7;
        dpxe dpxeVar8 = new dpxe("MAGIC_COMPOSE", 7, R.string.placeholder);
        h = dpxeVar8;
        dpxe dpxeVar9 = new dpxe("EMOTIFY", 8, R.string.penpal_screen_title);
        i = dpxeVar9;
        dpxe[] dpxeVarArr = {dpxeVar, dpxeVar2, dpxeVar3, dpxeVar4, dpxeVar5, dpxeVar6, dpxeVar7, dpxeVar8, dpxeVar9};
        l = dpxeVarArr;
        j = fczb.a(dpxeVarArr);
    }

    private dpxe(String str, int i2, int i3) {
        this.k = i3;
    }

    public static dpxe a(String str) {
        return (dpxe) Enum.valueOf(dpxe.class, str);
    }

    public static dpxe[] values() {
        return (dpxe[]) l.clone();
    }
}
