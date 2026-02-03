package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vao {
    public final Map a;
    public final Map b;
    private final Context c;

    public vao(Context context) {
        context.getClass();
        this.c = context;
        String string = context.getString(R.string.rephrase_tone);
        ento entoVar = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_REPHRASE;
        String string2 = context.getString(R.string.shakespeare_tone);
        ento entoVar2 = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_SHAKESPEARE;
        String string3 = context.getString(R.string.fellow_kid_tone);
        ento entoVar3 = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FELLOW_KID;
        String string4 = context.getString(R.string.excited_tone);
        ento entoVar4 = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_EXCITED;
        String string5 = context.getString(R.string.rhyme_tone);
        ento entoVar5 = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_RHYMES;
        String string6 = context.getString(R.string.formal_tone);
        ento entoVar6 = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FORMAL;
        String string7 = context.getString(R.string.concise_tone);
        ento entoVar7 = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_CONCISE;
        this.a = fcwa.f(new fcti(string, entoVar), new fcti(string2, entoVar2), new fcti(string3, entoVar3), new fcti(string4, entoVar4), new fcti(string5, entoVar5), new fcti(string6, entoVar6), new fcti(string7, entoVar7));
        epiv epivVar = epiv.TONE_UNSPECIFIED;
        ento entoVar8 = ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_UNSPECIFIED;
        this.b = fcwa.f(new fcti(epiv.TONE_REPHRASE, entoVar), new fcti(epiv.TONE_SHAKESPEARE, entoVar2), new fcti(epiv.TONE_CHILL, entoVar3), new fcti(epiv.TONE_EXCITED, entoVar4), new fcti(epiv.TONE_RHYMES, entoVar5), new fcti(epiv.TONE_FORMAL, entoVar6), new fcti(epiv.TONE_CONCISE, entoVar7), new fcti(epivVar, entoVar8), new fcti(epiv.UNRECOGNIZED, entoVar8));
    }
}
