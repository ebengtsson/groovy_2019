//made from https://github.com/libris/librisxl/blob/develop/whelktool/scripts/examples/deletebyid.groovy
selectByIds([
    'https://libris.kb.se/v4jr10lmsswpjjmx',
    'https://libris.kb.se/v4jr1t73stt9m2gt',
    'https://libris.kb.se/kt7gqhgfhn0kjw46',
    'https://libris.kb.se/pzclvsszmx4bm0f2',
    'https://libris.kb.se/hr5dnllwfjn9s3bd',
    'https://libris.kb.se/js6fpmmvgsmgzl2r',
    'https://libris.kb.se/s2gpzww0q2pjgjw3',
    'https://libris.kb.se/fp3bk86bcm7rplfg',
    'https://libris.kb.se/hr5dmb9gfcx88bjd',
    'https://libris.kb.se/7hw4c35s5mzhjhwh',
    'https://libris.kb.se/lv8hqhdfjd783m1z',
    'https://libris.kb.se/dn29kc1qbs1nrl8j',
    'https://libris.kb.se/gq4cmf5fdsb72xf3',
    'https://libris.kb.se/3cr085s41h6n1890',
    'https://libris.kb.se/3cr087961rmj79fh',
    'https://libris.kb.se/w5ks214ftph6j7l0',
    'https://libris.kb.se/lv8hrq45jh8bvg0p'
]) {
    it.scheduleDelete()
}
