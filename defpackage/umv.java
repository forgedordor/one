package defpackage;

import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umv implements umu {
    private static final ekgp a;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(ckml.LIKE, "anim_reaction_like.json");
        ekgiVar.i(ckml.LOVE, "anim_reaction_love.json");
        ekgiVar.i(ckml.LAUGH, "anim_reaction_laugh.json");
        ekgiVar.i(ckml.SURPRISED, "anim_reaction_surprised.json");
        ekgiVar.i(ckml.SAD, "anim_reaction_sad.json");
        ekgiVar.i(ckml.ANGRY, "anim_reaction_angry.json");
        ekgiVar.i(ckml.DISLIKE, "anim_reaction_dislike.json");
        ekgiVar.i(ckml.QUESTIONING, "anim_reaction_questioning.json");
        ekgiVar.i(ckml.CRYING_FACE, "anim_reaction_crying_face.json");
        ekgiVar.i(ckml.POUTING_FACE, "anim_reaction_pouting_face.json");
        ekgiVar.i(ckml.RED_HEART, "anim_reaction_red_heart.json");
        a = ekgiVar.c();
    }

    @Override // defpackage.umu
    public final cukz a(IllustrationViewStub illustrationViewStub, ckml ckmlVar) {
        illustrationViewStub.e();
        ekgp ekgpVar = a;
        ejwl.a(ekgpVar.containsKey(ckmlVar));
        String str = (String) ekgpVar.get(ckmlVar);
        str.getClass();
        illustrationViewStub.a = str;
        cukz cukzVar = (cukz) illustrationViewStub.c();
        if (ckmlVar == ckml.QUESTIONING) {
            cukzVar.setScaleX(1.7f);
            cukzVar.setScaleY(1.7f);
        }
        cukzVar.requestLayout();
        cukzVar.d();
        return cukzVar;
    }
}
