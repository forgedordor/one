package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aauj extends vo {
    public final ekgb a;
    private final cqjk d;
    private final fcsu e;
    private final fcsu f;
    private final RecyclerView g;

    public aauj(cqjk cqjkVar, fcsu fcsuVar, fcsu fcsuVar2, RecyclerView recyclerView, ekgb ekgbVar) {
        this.d = cqjkVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = recyclerView;
        this.a = ekgbVar;
    }

    public final void F(int i) {
        q(i + 1);
    }

    final void G() {
        int iL = l();
        aatc aatcVar = new aatc(iL > 0);
        RecyclerView recyclerView = this.g;
        einf.g(aatcVar, recyclerView);
        einf.g(new aatb(iL, Collection.EL.stream(this.a).mapToInt(new ToIntFunction() { // from class: aaud
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((aauu) obj).a();
            }
        }).sum()), recyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(boolean z, int i, int i2) {
        aauu aauuVar = (aauu) this.a.get(i);
        aaut aautVar = (aaut) aauuVar.c.get(i2);
        if (aautVar.e != z) {
            aautVar.e = z;
            if (z) {
                aauuVar.d++;
            } else {
                aauuVar.d--;
            }
        }
        F(i);
        G();
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.size() + 1;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        View viewInflate;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            viewInflate = layoutInflaterFrom.inflate(R.layout.header, viewGroup, false);
        } else {
            ejwl.l(i == 1);
            viewInflate = layoutInflaterFrom.inflate(R.layout.participant_message_list, viewGroup, false);
        }
        return new aaui(viewInflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        View view = ((aaui) wvVar).a;
        boolean z = false;
        if (dF(i) == 0) {
            TextView textView = (TextView) view;
            Context context = textView.getContext();
            String strA = cpef.a(context);
            textView.setText(dajs.b(context, this.e, this.f, context.getString(R.string.donation_header, strA), strA, aavc.a, aavc.b));
            eebt.b(textView);
            eebt.c(textView);
            return;
        }
        ejwl.l(true);
        final int i2 = i - 1;
        final aauu aauuVar = (aauu) this.a.get(i2);
        ejwl.l(aauuVar.a() > 0);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.parent_checkbox);
        checkBox.setText(aauuVar.b);
        int iA = aauuVar.a();
        int i3 = aauuVar.d;
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(iA == i3);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: aauf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                aauj aaujVar = this.a;
                ekgb ekgbVar = aaujVar.a;
                int i4 = i2;
                ((aauu) ekgbVar.get(i4)).d(z2);
                aaujVar.F(i4);
                aaujVar.G();
            }
        });
        int iA2 = aauuVar.a();
        int i4 = aauuVar.d;
        Resources resources = view.getResources();
        TextView textView2 = (TextView) view.findViewById(R.id.selected_count);
        Integer numValueOf = Integer.valueOf(i4);
        Integer numValueOf2 = Integer.valueOf(iA2);
        textView2.setText(resources.getString(R.string.donation_conversation_selected_count, numValueOf, numValueOf2));
        textView2.setContentDescription(resources.getString(R.string.donation_conversation_selected_count_of_total_count_content_description, resources.getQuantityString(R.plurals.donation_conversation_selected_count_content_description, i4, numValueOf), resources.getQuantityString(R.plurals.donation_conversation_total_count_content_description, iA2, numValueOf2)));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.message_list);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        linearLayout.removeAllViews();
        final int i5 = 0;
        while (i5 < aauuVar.a()) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.message, linearLayout, z);
            CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.id.checkbox);
            Context context2 = checkBox2.getContext();
            long jB = aauuVar.b(i5);
            Spanned spannedC = aauuVar.c(i5);
            String property = System.getProperty("line.separator");
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(context2.getResources().getDimensionPixelSize(R.dimen.checkbox_subtext_size));
            LayoutInflater layoutInflater = layoutInflaterFrom;
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(eehg.d(context2, R.attr.colorOnSurfaceVariant, "DataDonationListAdapter#createMessageCheckboxText: failed to get color R.attr.colorOnSurfaceVariant"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(String.valueOf(spannedC)).concat(String.valueOf(property)));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(this.d.a(jB));
            spannableStringBuilder.setSpan(absoluteSizeSpan, length, spannableStringBuilder.length(), 17);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            checkBox2.setText(spannableStringBuilder);
            checkBox2.setOnCheckedChangeListener(null);
            checkBox2.setChecked(aauuVar.e(i5));
            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: aauh
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    this.a.H(z2, i2, i5);
                }
            });
            ((ImageButton) viewInflate.findViewById(R.id.edit_button)).setOnClickListener(new View.OnClickListener() { // from class: aaue
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    einf.g(new aasz(aauuVar, i2, i5), view2);
                }
            });
            linearLayout.addView(viewInflate);
            i5++;
            layoutInflaterFrom = layoutInflater;
            z = false;
        }
    }

    final int l() {
        return Collection.EL.stream(this.a).mapToInt(new ToIntFunction() { // from class: aaub
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((aauu) obj).d;
            }
        }).sum();
    }
}
