package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drsl implements drts {
    public ekgb f;
    public final log g;
    public final Set h;
    public long i;
    public drsj j;
    public final drxg k;
    public boolean l;
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager");
    public static final ejxk b = ejxk.b(',');
    public static final drtr c = drtt.b("emoji_compat_version_representatives", "\u1fae9,🙂\u200d↔️,\u1fae8,\u1fae0,😮\u200d💨,🥲,🧑\u200d🦽,🥱,🥰,🤪,♀️,🤣");
    public static final drtr d = drtt.b("emoji_compat_app_whitelist", "");
    public static final drsl instance = new drsl();
    public static boolean e = false;

    public drsl() {
        int i = ekgb.d;
        this.f = ekoe.a;
        this.g = new drsh(this);
        this.h = new HashSet();
        this.j = drsj.a;
        this.k = drxg.b();
    }

    public static boolean b(drsj drsjVar) {
        drso.a();
        return drso.c("🥱", drsjVar);
    }

    public final lok a() {
        try {
            lok lokVarB = lok.b();
            if (lokVarB.a() == 1) {
                return lokVarB;
            }
            if (lokVarB.a() == 2) {
                ((ekrd) ((ekrd) a.e()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager", "getEmojiCompatIfLoaded", 336, "EmojiCompatManager.java")).q("EmojiCompat failed to load.");
            } else {
                ((ekrd) ((ekrd) a.e()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager", "getEmojiCompatIfLoaded", 338, "EmojiCompatManager.java")).q("EmojiCompat is not loaded.");
            }
            return null;
        } catch (IllegalStateException e2) {
            ((ekrd) ((ekrd) ((ekrd) a.e()).g(e2)).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager", "getEmojiCompatIfLoaded", (char) 343, "EmojiCompatManager.java")).q("EmojiCompat.init() was never called.");
            return null;
        }
    }
}
