package defpackage;

import sun.misc.Unsafe;

/* renamed from: xx4  reason: default package */
public final /* synthetic */ class xx4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!wx4.a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}