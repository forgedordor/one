package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyxc extends vo {
    public final CustomizationModel a;
    public final aam d;
    private final Context e;
    private final float f;
    private final float g;
    private final Map h;
    private final Map i;

    public cyxc(Context context, CustomizationModel customizationModel) {
        EnumMap enumMap = new EnumMap(evyz.class);
        this.h = enumMap;
        EnumMap enumMap2 = new EnumMap(evyz.class);
        this.i = enumMap2;
        this.e = context;
        this.a = customizationModel;
        this.f = context.getResources().getFraction(R.fraction.c2o_customization_category_disabled_alpha, 1, 1);
        this.g = context.getResources().getFraction(R.fraction.c2o_customization_category_enabled_alpha, 1, 1);
        this.d = new aam(new cywz(this));
        evyz evyzVar = evyz.EMOJI;
        enumMap.put((EnumMap) evyzVar, (evyz) Integer.valueOf(R.drawable.ic_insert_emoticon_white));
        evyz evyzVar2 = evyz.STICKER;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_insert_sticker_white);
        enumMap.put((EnumMap) evyzVar2, (evyz) numValueOf);
        evyz evyzVar3 = evyz.GALLERY;
        enumMap.put((EnumMap) evyzVar3, (evyz) Integer.valueOf(R.drawable.ic_insert_photo_white));
        evyz evyzVar4 = evyz.LOCATION;
        enumMap.put((EnumMap) evyzVar4, (evyz) Integer.valueOf(R.drawable.quantum_gm_ic_location_on_white_24));
        evyz evyzVar5 = evyz.GIF;
        enumMap.put((EnumMap) evyzVar5, (evyz) Integer.valueOf(R.drawable.ic_insert_gif_white));
        evyz evyzVar6 = evyz.EXPRESSIVE_STICKER;
        enumMap.put((EnumMap) evyzVar6, (evyz) numValueOf);
        evyz evyzVar7 = evyz.CONTACT;
        enumMap.put((EnumMap) evyzVar7, (evyz) Integer.valueOf(R.drawable.quantum_gm_ic_person_white_24));
        evyz evyzVar8 = evyz.FILE;
        enumMap.put((EnumMap) evyzVar8, (evyz) Integer.valueOf(R.drawable.quantum_ic_attachment_white_24));
        enumMap2.put((EnumMap) evyzVar, (evyz) Integer.valueOf(R.string.c2o_category_name_emojis));
        Integer numValueOf2 = Integer.valueOf(R.string.c2o_category_name_stickers);
        enumMap2.put((EnumMap) evyzVar2, (evyz) numValueOf2);
        enumMap2.put((EnumMap) evyzVar3, (evyz) Integer.valueOf(R.string.c2o_category_name_gallery));
        enumMap2.put((EnumMap) evyzVar4, (evyz) Integer.valueOf(R.string.c2o_category_name_location));
        enumMap2.put((EnumMap) evyzVar5, (evyz) Integer.valueOf(R.string.c2o_category_name_gif));
        enumMap2.put((EnumMap) evyzVar6, (evyz) numValueOf2);
        enumMap2.put((EnumMap) evyzVar7, (evyz) Integer.valueOf(R.string.c2o_category_name_contact));
        enumMap2.put((EnumMap) evyzVar8, (evyz) Integer.valueOf(R.string.c2o_contact_share_file_text));
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.a() - 1;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new cyxb(this, LayoutInflater.from(this.e).inflate(R.layout.compose2o_customization_draggable_item_view, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        cyxb cyxbVar = (cyxb) wvVar;
        evzb evzbVarB = this.a.b(i);
        evzc evzcVar = null;
        if (evzbVarB.d) {
            cyxbVar.a.setOnTouchListener(cyxbVar);
            TextView textView = cyxbVar.u;
            float f = this.g;
            textView.setAlpha(f);
            cyxbVar.t.setAlpha(f);
            cyxbVar.s.setAlpha(f);
            Switch r1 = cyxbVar.v;
            r1.setEnabled(true);
            r1.setOnCheckedChangeListener(new cyxa(this, i));
        } else {
            cyxbVar.a.setOnTouchListener(null);
            TextView textView2 = cyxbVar.u;
            float f2 = this.f;
            textView2.setAlpha(f2);
            cyxbVar.t.setAlpha(f2);
            cyxbVar.s.setAlpha(f2);
            Switch r9 = cyxbVar.v;
            r9.setEnabled(false);
            r9.setOnCheckedChangeListener(null);
        }
        TextView textView3 = cyxbVar.u;
        evyz evyzVarB = evyz.b(evzbVarB.b);
        if (evyzVarB == null) {
            evyzVarB = evyz.UNRECOGNIZED;
        }
        Map map = this.i;
        textView3.setText(map.containsKey(evyzVarB) ? ((Integer) map.get(evyzVarB)).intValue() : 0);
        Switch r92 = cyxbVar.v;
        int i2 = evzbVarB.c;
        if (i2 == 0) {
            evzcVar = evzc.INVALID;
        } else if (i2 == 1) {
            evzcVar = evzc.VISIBLE;
        } else if (i2 == 2) {
            evzcVar = evzc.INVISIBLE;
        }
        if (evzcVar == null) {
            evzcVar = evzc.UNRECOGNIZED;
        }
        r92.setChecked(evzcVar == evzc.VISIBLE);
        ImageView imageView = cyxbVar.t;
        evyz evyzVarB2 = evyz.b(evzbVarB.b);
        if (evyzVarB2 == null) {
            evyzVarB2 = evyz.UNRECOGNIZED;
        }
        Map map2 = this.h;
        imageView.setImageResource(map2.containsKey(evyzVarB2) ? ((Integer) map2.get(evyzVarB2)).intValue() : 0);
    }
}
