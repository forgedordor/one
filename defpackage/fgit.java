package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgit extends fgmf {
    public static final Pattern[][] a = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    private final Pattern c;
    private final fgkw b = new fgkw();
    private boolean d = false;
    private fgic e = new fgic();

    public fgit(Pattern pattern) {
        this.c = pattern;
    }

    @Override // defpackage.fgmi
    public final fgkk b() {
        return this.b;
    }

    @Override // defpackage.fgmi
    public final fgmh c(fgml fgmlVar) {
        if (this.d) {
            return null;
        }
        fgin fginVar = (fgin) fgmlVar;
        if (fginVar.h && this.c == null) {
            return null;
        }
        return new fgid(fginVar.d, -1, false);
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final void d(fgly fglyVar) {
        fgic fgicVar = this.e;
        if (fgicVar.b != 0) {
            fgicVar.a.append('\n');
        }
        CharSequence charSequence = fglyVar.a;
        fgicVar.a.append(charSequence);
        fgicVar.b++;
        Pattern pattern = this.c;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.d = true;
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final void l() {
        StringBuilder sb = this.e.a;
        this.e = null;
    }
}
