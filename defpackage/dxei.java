package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.avatar.ContactAvatarView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxei extends LinearLayout implements dxed {
    public int a;
    public final TextView b;
    final Animatable c;
    final pnz d;
    private final List e;
    private final RelativeLayout f;
    private final LinearLayout g;

    public dxei(Context context) {
        super(dwyh.a(context, fbfm.i()), null, 0);
        this.e = new ArrayList(5);
        this.a = 5;
        inflate(getContext(), R.layout.typing_indicator_view, this);
        this.g = (LinearLayout) findViewById(R.id.typers);
        this.c = (Animatable) ((ImageView) findViewById(R.id.typing_dots)).getDrawable();
        this.f = (RelativeLayout) findViewById(R.id.typing_indicator_contents);
        TextView textView = (TextView) findViewById(R.id.additional_typers);
        this.b = textView;
        textView.setVisibility(8);
        this.d = new dxeh(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c() {
        Animatable animatable = this.c;
        animatable.stop();
        poe.a((Drawable) animatable, this.d);
        animatable.start();
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    @Override // defpackage.dxed
    public final void b(List list) {
        if (list.size() > this.a) {
            this.b.setVisibility(0);
            this.g.setVisibility(8);
            c();
        } else {
            if (list.isEmpty()) {
                Object obj = this.c;
                pnz pnzVar = this.d;
                Drawable drawable = (Drawable) obj;
                if (drawable == null || pnzVar == null || !(drawable instanceof Animatable)) {
                    return;
                }
                poe.c((AnimatedVectorDrawable) drawable, pnzVar);
                return;
            }
            this.g.setVisibility(0);
            this.b.setVisibility(8);
            c();
        }
        List list2 = this.e;
        int size = list2.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (!list.contains(list2.get(size)) && list2.get(size) != null) {
                list2.remove(size);
                this.g.removeViewAt(size);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            dwpf dwpfVar = (dwpf) list.get(i);
            if (!list2.contains(dwpfVar)) {
                list2.add(dwpfVar);
                ContactAvatarView contactAvatarView = new ContactAvatarView(getContext());
                contactAvatarView.b(dwpfVar);
                int dimension = (int) getContext().getResources().getDimension(R.dimen.avatar_size);
                contactAvatarView.d = dimension;
                Bitmap bitmap = contactAvatarView.e;
                if (bitmap != null) {
                    contactAvatarView.a.setImageBitmap(Bitmap.createScaledBitmap(bitmap, dimension, dimension, false));
                }
                contactAvatarView.setImportantForAccessibility(2);
                contactAvatarView.setFocusable(false);
                contactAvatarView.setPadding(0, 0, (int) getContext().getResources().getDimension(R.dimen.avatar_padding), 0);
                this.g.addView(contactAvatarView);
            }
        }
        int size2 = list.size();
        this.f.setContentDescription((list.size() == 1 && ((dwpf) list.get(0)).i().g()) ? getContext().getString(R.string.user_typing_message, ((dwpf) list.get(0)).i().c()) : getResources().getQuantityString(R.plurals.number_of_users_typing_message, size2, Integer.valueOf(size2)));
    }
}
